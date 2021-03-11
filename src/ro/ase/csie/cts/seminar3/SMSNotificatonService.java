package ro.ase.csie.cts.seminar3;

public class SMSNotificatonService implements NotificationService{

    @Override
    public void notify(Person destination, String msg) {
        System.out.println("Sending sms to " + destination.getMobile());
        System.out.println(msg);
    }
}
