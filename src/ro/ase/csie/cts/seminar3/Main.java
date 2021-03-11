package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, BankAccount> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        BankAccount b1 = new BankAccount("RFZ2324234234", p1);

        Person p2 = new Person("Brusli");
        BankAccount b2 = new FeeBankAccount("INGB32413432532", p2);

        Person p3  = new Person("Van Damme");
        BankAccount b3 = new BankAccount("BT1322432423423", p3);

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(BankAccount a : employees.values()) {
            a.deposit(1000);
        }

        for(BankAccount a : employees.values()) {
            try {
                a.withdraw(10);
            } catch(InsufficientFundsException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}