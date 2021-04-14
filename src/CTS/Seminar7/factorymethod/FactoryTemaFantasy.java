package CTS.Seminar7.factorymethod;

import CTS.Seminar7.simplefactory.SuperErouAbstract;
import CTS.Seminar7.simplefactory.TipErou;

public class FactoryTemaFantasy extends FactoryAbstract {
    @Override
    public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
        SuperErouAbstract supererou = null;
        switch (tip) {
            case DISNEY:
                supererou = new CaracterFantasyDisney(nume, 100);
                break;
            case DC:
                supererou = new CaracterFantasyDC(nume, 500);
                break;
            case MARVEL:
                supererou = new CaracterFantasyMarvel(nume, 250);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return supererou;
    }
}