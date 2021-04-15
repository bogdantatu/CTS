package CTS.Seminar8.decorator;

import CTS.Seminar8.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter {

    private int nivelScut;

    public DecoratorScut(ACMECaracterJoc caracterJoc, int nivelScut) {
        super(caracterJoc);
        this.nivelScut = nivelScut;
    }

    @Override
    public void esteLovit(int puncte) {
        int puncteLovitura = puncteViata - this.nivelScut;
        if (puncteLovitura > 0) {
            super.esteLovit(puncteLovitura);
        }

    }
}