package ro.ase.csie.cts.seminar3;

public class BankAccount implements Account {
    private long balance;
    private String iban;
    private Person accountHolder;


    public BankAccount(String iban, Person accountHolder) {
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insuficient funds " + balance);
        System.out.println("withdrawing " + amount + " from " + iban);
        balance -= amount;
    }

    @Override
    public void deposit(long amount) {
        System.out.println("Adding " + amount + " to " + iban);
        balance += amount;
    }

    public long getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }
}