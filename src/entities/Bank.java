package entities;

public class Bank {
    private int accountNumber;
    private String holder;
    private double balance;

    public Bank(){}

    public Bank(int accountNumber, String holder){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = 0;
    }

    public Bank(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Account "
                + accountNumber
                +", Holder "
                + holder
                +"Balance: $ "
                + String.format("%.2f",balance);
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double draw){
        balance -= draw + 5.0;
    }

}
