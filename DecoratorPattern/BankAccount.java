package DecoratorPattern;

public interface BankAccount {
    String showAccountType();
    Double getInterestRate();
    Double getBalance();
    String showBenefits();//Changed to String (in the UML, it is Double) because the required output is String
    Double computeBalanceWithInterest();
    String showInfo();
}
