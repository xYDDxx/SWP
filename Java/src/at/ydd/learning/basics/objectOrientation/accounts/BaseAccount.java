package at.ydd.learning.basics.objectOrientation.accounts;

public class BaseAccount {
    private int balance;

    public BaseAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit (int depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposited " + depositAmount + "€");
    }




}
