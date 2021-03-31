package CTS.Seminar6.builder;

public class TestBuilder {
    public static void main(String[] args) {

        //1. construiesti obiectul
       // SuperErou superErou = new SuperErou();
        //2. initializarea atributelor
      //  superErou.nume = "SuperDavid";

       // SuperErou superEuro2 = new SuperErou("Aquaman", 100, false, false, new Arma(),
         //       null, null, null);


        SuperErou superDavid = new SuperErou.SuperErouBuilder("SuperDavid", 100)
                .setArmaDreapta(new Arma())
                .setArmaStanga(new Arma())
                .build();

        SuperErou joker = new SuperErou.SuperErouBuilder("Joker", 200)
                .esteNegativ()
                .esteRanit()
                .setArmaDreapta(new Arma())
                .build();
    }
}
