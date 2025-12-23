//question-1 of Part 4
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn.");
            } else {
                System.out.println("Error: Not enough balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account balance: " + balance);
    }
}


//question-2 of Part 4
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(5000);    
        myAccount.withdraw(7000);     
        myAccount.displayAccountInfo(); 
    }
}
