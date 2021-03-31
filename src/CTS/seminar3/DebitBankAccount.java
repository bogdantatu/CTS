package CTS.seminar3;

public class DebitBankAccount extends BankAccount implements Payable, Receivable, Transferable {
    public DebitBankAccount(NotificationService ns, String iban, Person person) {
        super(ns);
        this.iban = iban;
        this.accountHolder = person;
        this.balance = 0;

    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient Funds");
        }
        notificationService.notify(accountHolder, "Withdrawing " + amount + " from " + iban);
        balance -= amount;
    }

    @Override
    public void deposit(long amount){
        notificationService.notify(accountHolder, "Adding " + amount + " to " + iban);
        balance += amount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void transfer(Receivable destination, long amonunt) throws InsufficientFundsException {
        this.withdraw(amonunt);
        destination.deposit(amonunt);
    }
}