import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount2 {

    private AtomicInteger saldo;

    public BankAccount2(int saldo) {
        this.saldo = new AtomicInteger(saldo);
    }

    public synchronized void versamento(int amount) {
        saldo.addAndGet(amount);
    }

    public synchronized void prelievo(int amount) {
        saldo.addAndGet(-amount);
    }

    public AtomicInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(AtomicInteger saldo) {
        this.saldo = saldo;
    }
}
