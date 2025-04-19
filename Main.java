public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ali", 5000);
        BankAccount acc2 = new BankAccount("Sara");

        acc1.deposit(1000);
        acc2.deposit(200);

        acc1.withdraw(300);
        acc2.withdraw(500);

        acc1.display();
        acc2.display();

        BankAccount.showTotalAccounts();
    }
}

class BankAccount {
    private String ownerName;
    private int accountNumber;
    private double balance;
    static int accountCounter;

    BankAccount(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
        accountCounter++;
        this.accountNumber = 1000 + accountCounter;
    }

    BankAccount(String name) {
        this(name, 0.0);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance.");
    }

    public void display() {
        System.out.println("Account Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts created: " + accountCounter);
    }
}