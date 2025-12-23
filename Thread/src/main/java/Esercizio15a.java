import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Esercizio15a {

    public static void main(String[] args) throws InterruptedException {
        simulateBigFileDownload();
        timeCounter();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            try {
                simulateBigFileDownload ();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executor.submit(() -> {
            try {
                timeCounter();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void simulateBigFileDownload() throws InterruptedException {
        System.out.println("Download del file in corso");
        Thread.sleep(4000);
        System.out.println();
        System.out.println("Download completato");
    }

    private static void timeCounter() throws InterruptedException {
        for(int i = 1; i <= 6; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

}
