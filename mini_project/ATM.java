package mini_project;
import java.util.*;

class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account created with balance: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        balance += amount;
        transactionHistory.add("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: " + amount + " | Balance: " + balance);
    }

    public void addTransaction(String message) {
        transactionHistory.add(message);
    }
}

class ATMSystem {
    private HashMap<Integer, Account> accounts;

    public ATMSystem() {
        accounts = new HashMap<>();
    }

    public void createAccount(int accountNumber, String holderName, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            throw new RuntimeException("Account number already exists");
        }
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }
        Account account = new Account(accountNumber, holderName, initialBalance);
        accounts.put(accountNumber, account);
    }

    public Account getAccount(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            throw new InvalidAccountException("Account not found");
        }
        return accounts.get(accountNumber);
    }

    public void depositToAccount(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFromAccount(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        account.withdraw(amount);
    }

    public double checkBalance(int accountNumber) {
        return getAccount(accountNumber).getBalance();
    }

    public ArrayList<String> getTransactionHistory(int accountNumber) {
        return getAccount(accountNumber).getTransactionHistory();
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMSystem atm = new ATMSystem();

        while (true) {
            System.out.println("\n=== ATM Simulation System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number only.");
                sc.nextLine();
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter account number: ");
                        int accNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter account holder name: ");
                        String name = sc.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Account holder name cannot be empty");
                            break;
                        }

                        System.out.print("Enter initial balance: ");
                        double initialBalance = sc.nextDouble();

                        atm.createAccount(accNo, name, initialBalance);
                        System.out.println("Account created successfully");
                        break;

                    case 2:
                        System.out.print("Enter account number: ");
                        int depAccNo = sc.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();

                        atm.depositToAccount(depAccNo, depositAmount);
                        System.out.println("Amount deposited successfully");
                        break;

                    case 3:
                        System.out.print("Enter account number: ");
                        int withAccNo = sc.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();

                        atm.withdrawFromAccount(withAccNo, withdrawAmount);
                        System.out.println("Amount withdrawn successfully");
                        break;

                    case 4:
                        System.out.print("Enter account number: ");
                        int balAccNo = sc.nextInt();

                        double balance = atm.checkBalance(balAccNo);
                        System.out.println("Current balance: " + balance);
                        break;

                    case 5:
                        System.out.print("Enter account number: ");
                        int histAccNo = sc.nextInt();

                        ArrayList<String> history = atm.getTransactionHistory(histAccNo);
                        System.out.println("Transaction History:");
                        for (String transaction : history) {
                            System.out.println(transaction);
                        }
                        break;

                    case 6:
                        System.out.println("Thank you for using ATM Simulation System");
                        return;

                    default:
                        System.out.println("Invalid choice. Please select from 1 to 6.");
                }
            } catch (InvalidAccountException | InsufficientBalanceException | InvalidAmountException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}