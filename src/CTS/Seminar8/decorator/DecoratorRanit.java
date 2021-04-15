package CTS.Seminar8.decorator;

import CTS.Seminar8.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter {

    public DecoratorRanit(ACMECaracterJoc caracterJoc) {
        super(caracterJoc);
    }

    @Override
    public void seDeplaseaza() {
        if (this.caracterJoc.getPuncteViata() < 100) {
            System.out.println("Nu se mai poate deplasa. Este ranit critic");
        } else {
            this.caracterJoc.seDeplaseaza();
        }
    }
}