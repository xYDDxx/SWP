package at.ydd.learning.basics.objectOrientation.accounts;

public class CreditAccount extends BaseAccount {
    private int balance;
    private int limit;

    public CreditAccount(int balance, int limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(int withdrawAmount) {
        if (balance - withdrawAmount >= limit) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn " + withdrawAmount + "€");
        } else {
            System.out.println("Limit exceeded, try a different amount");
        }
    }
}
