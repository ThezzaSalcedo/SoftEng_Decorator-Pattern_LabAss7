package DecoratorPattern;

public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance*getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\n" +
                "Account Name: " + accountName + "\n" +
                "Balance: " + balance;
    }
}
