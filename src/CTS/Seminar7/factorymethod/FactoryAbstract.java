package CTS.Seminar7.factorymethod;

import CTS.Seminar7.simplefactory.SuperErouAbstract;
import CTS.Seminar7.simplefactory.TipErou;

public abstract class FactoryAbstract {

    public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}