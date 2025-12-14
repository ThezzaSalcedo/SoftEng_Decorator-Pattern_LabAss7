package DecoratorPattern;

public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount() {
        // Added method just to comply with the requirement
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
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
