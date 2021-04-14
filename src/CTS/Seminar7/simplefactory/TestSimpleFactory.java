package CTS.Seminar7.simplefactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
//        SuperErouAbstract supererou = new CaracterDisney("Donald Duck", 100, false);
//        supererou = new CaracterMarvel("Thor", 150, 50);
//        supererou = new CaracterDCComics("Superman", 150, 100);

        SuperErouAbstract supererou = null;
        boolean selectieTemaUniversala = true;

        if (selectieTemaUniversala) {
            supererou = FactorySuperErou.getSuperErou(TipErou.DISNEY, "Donald Duck");
            supererou = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Thor");
            supererou = FactorySuperErou.getSuperErou(TipErou.DC, "Superman");
        } else {
        }
    }
}