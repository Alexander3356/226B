import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCounter {

    public static void main(String[] args) throws Exception {
        // Creo un pool di 4 thread
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Creo un contatore ( E' un oggetto quindi va nell'heap che è condiviso da tutti i thread )
        Counter counter = new Counter();

        // Sottometto 1000 task, ognuno incrementa il contatore di 1, voglio ottenere 1000 al termine di tutte le somme
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> counter.increment());
        }

        executor.shutdown();
        boolean response = executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("awaitTermination response: " + response);

        System.out.println(counter.getCount());
        // Risultato atteso: 1000
    }


}
// Creo ed uso una inner class
class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // PROBLEMA: Non è atomico!
    }

    public AtomicInteger getCount() {
        return count;
    }
}