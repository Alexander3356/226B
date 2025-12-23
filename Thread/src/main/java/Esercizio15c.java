import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Esercizio15c {
    public static void main(String[] args) throws InterruptedException {
        BankAccount2 bankAccount = new BankAccount2(1000);

        ExecutorService executor = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                bankAccount.prelievo(1);
            });
        }
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                bankAccount.versamento(1);
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(bankAccount.getSaldo());
    }
}
