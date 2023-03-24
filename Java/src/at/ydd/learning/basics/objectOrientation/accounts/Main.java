package at.ydd.learning.basics.objectOrientation.accounts;

public class Main {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(1000);
        CheckingAccount ch1 = new CheckingAccount(100,-1000);
        CreditAccount c1 = new CreditAccount(0,-10000);

        s1.getBalance();
        s1.withdraw(900);
    }
}
