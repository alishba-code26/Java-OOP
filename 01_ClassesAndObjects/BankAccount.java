class BankAccount1 {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        BankAccount1 b1 = new BankAccount1();

        b1.accountHolder = "Ali";
        b1.accountNumber = 12345;
        b1.balance = 10000;

        b1.deposit(5000);
        b1.withdraw(2000);

        b1.displayBalance();
    }
}
