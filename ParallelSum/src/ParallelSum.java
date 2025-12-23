import java.util.concurrent.*;
import java.util.*;


//Cosa facciamo in questo esercizio:
//Creiamo un array di 1 miliardo di numeri
//Creiamo un pool di N thread
//Dividiamo l'array in N porzioni uguali
//Ogni thread calcola la somma della sua porzione in parallelo
//Raccogliamo tutti i risultati parziali con future.get()
//Sommiamo i risultati parziali per ottenere il totale


public class ParallelSum {
    public static final int N = 1000000000;  // Numero di thread presenti nel pool

    public static void main(String[] args) throws Exception {
        // Array di 1 miliardo di numeri
        int[] numbers = new int[1_000_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // 1, 2, 3, ... 1'000'000'000
        }

        long startTime = System.currentTimeMillis();  // istante di inzio del calcolo

        // Creiamo un pool di thread
        ExecutorService executor = Executors.newFixedThreadPool(N);

        // Dividiamo il lavoro in un numero di parti pari al numero di thread
        int chunkSize = numbers.length / N;
        List<Future<Long>> results = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int start = i * chunkSize;
            // la prossima riga si legge: if (i==THREAD_NUMBER-1) allora (end=numbers.length) else (end=start+chunkSize);
            int end = (i == N -1) ? numbers.length : start + chunkSize;

            // Submit con Callable restituisce un Future per ottenere il risultato
            Future<Long> future = executor.submit(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }
                System.out.println("Thread " +
                        Thread.currentThread().getName() +
                        " ha calcolato: " + sum);
                return sum;
            });

            results.add(future);
        }

        // Raccogliamo i risultati da tutti i thread. Results è una lista di Future
        long totalSum = 0;
        for (Future<Long> future : results) {
            totalSum += future.get(); // Aspetta che ogni singolo thread finisca
        }

        System.out.println("Somma totale: " + totalSum);

        // IMPORTANTE: Chiudere sempre il pool!
        executor.shutdown();


        // Calcolo del tempo impiegato
        long endTime = System.currentTimeMillis();  // istante di fine calcolo
        long calculationTime = endTime - startTime;   // tempo impiegato per il calcolo (in ms)
        System.out.println("Tempo impiegato: " + calculationTime + " ms\n");
    }
}