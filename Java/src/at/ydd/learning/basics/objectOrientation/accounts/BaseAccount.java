package at.ydd.learning.basics.objectOrientation.accounts;

public class BaseAccount {
    private int balance;

    public BaseAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void returnBalance(){
        System.out.println("Balance: " + balance + "€");
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit (int depositAmount){
        setBalance(getBalance()+depositAmount);
        System.out.println("Deposited " + depositAmount + "€");
    }




}
