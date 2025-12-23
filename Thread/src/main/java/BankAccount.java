public class BankAccount {

    private int saldo;

    public BankAccount(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void versamento(int amount) {
        saldo += amount;
    }

    public synchronized void prelievo(int amount) {
        saldo -= amount;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
