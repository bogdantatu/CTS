package CTS.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        NotificationService smsService = new SMSNotificatonService();
        NotificationService emailService = new EmailNotificationService();

        Map<Person, Receivable> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        p1.setEmail("chuck@norris.com");
        p1.setMobile("0123456");
        CreditBankAccount b1 = new CreditBankAccount(smsService,"RFZ2324234234", p1, -500);

        Person p2 = new Person("Brusli");
        p2.setEmail("brusli@ilbatpechucknorris.com");
        p2.setMobile("+34235352345324");
        DebitBankAccount b2 = new FeeBankAccount(emailService,"INGB32413432532", p2);

        Person p3  = new Person("Van Damme");
        p3.setEmail("jeanclaude@vandamme.com");
        p3.setMobile("+1264634534534");
        DebitBankAccount b3 = new DebitBankAccount(emailService,"BT1322432423423", p3);

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(Receivable a : employees.values()) {
            a.deposit(1000);
        }

        Map<Person, Payable> union= new HashMap<>();

        union.put(p2, b2);
        union.put(p3, b3);

        for(Payable a : union.values()) {
            try {
                a.withdraw(10);
            } catch(InsufficientFundsException ex){
                System.out.println(ex.getMessage());
            }
        }

        try {
            b2.transfer(b3,200);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}