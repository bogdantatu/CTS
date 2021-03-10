package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;
import ro.ase.csie.cts.seminar2.solid.InsufficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Costel");
        BankAccount account = new BankAccount("RO50BRDE34324234342342342", person);

        account.deposit(100);

        try {
            account.withdraw(30);
            account.withdraw(40);
            account.withdraw(70);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.getBalance());

        account = new FeeBankAccount("RO50BRDE34324234342342342", person);
        account.deposit(500);

        try {
            account.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.getBalance());
    }
}