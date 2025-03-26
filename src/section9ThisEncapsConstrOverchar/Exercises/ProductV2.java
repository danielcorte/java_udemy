package section9ThisEncapsConstrOverchar.Exercises;

public class ProductV2 {

    private int number;
    private String holder;
    private double balance;

    public ProductV2(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public ProductV2(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

     public int getNumber() {
        return this.number;
     }

     /*
     public void setNumber(int number) {
        this.number = number;
     }
     */

     public String getHolder() {
        return this.holder;
     }

     public void setHolder(String holder) {
        this.holder = holder;
     }

     public double getBalance() {
        return this.balance;
     }

     /* SALDO SO PODE SER ALTERADO POR SAQUE E DEPOSITO
     public void setBalance(double balance) {
        this.balance = balance;
     }
     */

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {

        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
