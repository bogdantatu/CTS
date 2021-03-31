package CTS.seminar3;

public class FeeBankAccount extends DebitBankAccount {
    private long fee = 2;

    public FeeBankAccount(NotificationService ns, String iban, Person accountHolder) {
        super(ns, iban, accountHolder);
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {

        notificationService.notify(accountHolder, "Adding " + fee + " fee to withdrawal");
        super.withdraw(amount + fee);
    }
}