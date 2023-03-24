package at.ydd.learning.basics.objectOrientation.accounts;

public class CheckingAccount extends BaseAccount {
    private int balance;
    private int limit;

    public CheckingAccount(int balance, int limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(int withdrawAmount) {
        if (getBalance() - withdrawAmount >= limit) {
            getBalance(getBalance()-withdrawAmount)
            System.out.println("Withdrawn " + withdrawAmount + "€");
        } else {
            System.out.println("Limit exceeded, try a different amount");
        }
    }
}
