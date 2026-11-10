class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance+amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount >= balance) {
            balance = balance- amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance = balance- amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println(" Minimum balance of 100 must be maintained.");
        }
    }
}

public class Ass9program2 {
    public static void main(String args[]) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);
        account.withdraw(300);
        account.withdraw(250);
    }
}

