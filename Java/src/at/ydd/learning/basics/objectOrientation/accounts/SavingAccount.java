package at.ydd.learning.basics.objectOrientation.accounts;

public class SavingAccount extends BaseAccount {
    private int balance;

    public SavingAccount(int balance) {
        super(balance);
    }

    public void withdraw(int withdrawAmount) {
        if (getBalance()-withdrawAmount>0) {
            setBalance(getBalance()-withdrawAmount);
            System.out.println("Withdrawn " + withdrawAmount + "€");
        } else {
            System.out.println("Limit exceeded, try a different amount");
        }
    }

}
