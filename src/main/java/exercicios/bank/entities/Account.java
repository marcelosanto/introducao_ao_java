package exercicios.bank.entities;

public class Account {
    private int number;
    private String holder;
    private double deposity;

    public Account(int number, String holder, double deposity) {
        this.number = number;
        this.holder = holder;
        this.deposity = deposity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposity() {
        return deposity;
    }

    public void Deposit(double deposity) {
        this.deposity += deposity;
    }

    public void WithdrawDeposit(double deposity) {
        this.deposity -= deposity + 5.00;
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + '\'' + ", Balance: "
                + String.format("%.2f", getDeposity())
                + "\n";
    }
}
