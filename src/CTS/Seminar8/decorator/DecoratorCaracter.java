package CTS.Seminar8.decorator;

import CTS.Seminar8.adapter.ACMECaracterJoc;

public class DecoratorCaracter extends ACMECaracterJoc {
    ACMECaracterJoc caracterJoc = null;

    public DecoratorCaracter(ACMECaracterJoc caracterJoc) {
        super(caracterJoc.getNume(), caracterJoc.getPuncteViata());
        this.caracterJoc = caracterJoc;
    }

    @Override
    public void seDeplaseaza() {
        this.caracterJoc.seDeplaseaza();
    }

    @Override
    public void esteLovit(int puncte) {
        this.caracterJoc.esteLovit(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.caracterJoc.seVindeca(puncte);
    }

}
