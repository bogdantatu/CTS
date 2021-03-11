package ro.ase.csie.cts.seminar3;

import ro.ase.csie.cts.seminar2.solid.BankAccount;

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