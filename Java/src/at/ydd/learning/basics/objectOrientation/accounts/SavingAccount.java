package at.ydd.learning.basics.objectOrientation.accounts;

public class SavingAccount extends BaseAccount {


    public SavingAccount(int balance) {
        super(balance);
    }

    public void withdraw(int withdrawAmount) {
        if (balance-withdrawAmount>0) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn " + withdrawAmount + "€");
        } else {
            System.out.println("Limit exceeded, try a different amount");
        }
    }
}
