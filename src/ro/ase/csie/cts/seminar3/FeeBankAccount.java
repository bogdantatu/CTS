package ro.ase.csie.cts.seminar3;

import ro.ase.csie.cts.seminar2.solid.BankAccount;

public class FeeBankAccount extends DebitBankAccount {
    private long fee = 2;

    public FeeBankAccount(String iban, Person accountHolder) {
        super(iban, accountHolder);
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        System.out.println("Adding " + fee + " fee to withdrawal");
        super.withdraw(amount + fee);
    }
}