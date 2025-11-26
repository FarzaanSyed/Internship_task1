package OOPs.Task;

public class BankAccount {

    private int id;
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance = 0;
    private String ifscCode;

    public BankAccount(int id, String accountHolderName, long accountNumber, double accountBalance, String ifscCode) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance += accountBalance;
        this.ifscCode = ifscCode;
    }
    // Using Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public long getAccountNumber() { return accountNumber; }
    public void setAccountNumber(long accountNumber) { this.accountNumber = accountNumber; }

    public double getAccountBalance() { return accountBalance; }
    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    public String getIfscCode() { return ifscCode; }
    public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode; }

    // Methods
    public void displayInfoAndBalance() {
        System.out.println(this.toString());
    }
    public void displayBalance() {
        System.out.println(String.format("Account Balance is %s", accountBalance));
    }
    public void deposit(double amount) {
        if ( amount > 0) {
            accountBalance += amount;
            displayBalance();
        }
        else System.out.println("Invalid Amount");
    }
    public void withdraw(double amount) {
        if (accountBalance > 0 && amount < accountBalance) {
            accountBalance -= amount;
            displayBalance();
        }
        else System.out.println("Invalid Amount");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + getId() +
                ", accountHolderName='" + getAccountHolderName() + '\'' +
                ", accountNumber=" + getAccountNumber() +
                ", accountBalance=" + getAccountBalance() +
                ", ifscCode='" + getIfscCode() + '\'' +
                '}';
    }
    public void updateBankAccount(int id, String accountHolderName, long accountNumber,
                                  double accountBalance, String ifscCode) {
        setId(id);
        setAccountHolderName(accountHolderName);
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
        setIfscCode(ifscCode);
        displayInfoAndBalance();
    }
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1, "Farzaan Syed",
                957349368, 70000, "SBIWE30881");

        bankAccount1.displayInfoAndBalance();
        bankAccount1.withdraw(50000);
        bankAccount1.withdraw(40000);
        bankAccount1.deposit(80000);
        bankAccount1.displayInfoAndBalance();
        bankAccount1.updateBankAccount(2, "Maaz Shaikh",
                924604680, 70000, "SBIWE9770");

    }

}
