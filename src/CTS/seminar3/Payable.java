package CTS.seminar3;

public interface Payable {
    void withdraw(long amount) throws InsufficientFundsException;
}
