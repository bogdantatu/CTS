package CTS.seminar3;

public class CreditBankAccount extends BankAccount implements Receivable{

    public CreditBankAccount(NotificationService ns, String iban, Person accountHolder, long balance) {
        super(ns);
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(long amount) {
        notificationService.notify(accountHolder, "Adding " + amount + "to " + iban);
        this.balance += amount;
    }
}
