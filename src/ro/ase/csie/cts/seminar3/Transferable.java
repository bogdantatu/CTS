package ro.ase.csie.cts.seminar3;

public interface Transferable {

     void transfer(Receivable destination, long amonunt) throws InsufficientFundsException;

}
