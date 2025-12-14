package DecoratorPattern;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount() {
        // Added method just to comply with the requirement
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance()*getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
