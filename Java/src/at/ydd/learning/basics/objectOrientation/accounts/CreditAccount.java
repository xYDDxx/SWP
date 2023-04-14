package at.ydd.learning.basics.objectOrientation.accounts;

public class CreditAccount extends BaseAccount {
    private int limit;

    public CreditAccount(int balance, int limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(int withdrawAmount) {
        if (getBalance() - withdrawAmount >= limit) {
            setBalance(getBalance()-withdrawAmount);
            System.out.println("Withdrawn " + withdrawAmount + "€");
        } else {
            System.out.println("Limit exceeded, try a different amount");
        }
    }
}
