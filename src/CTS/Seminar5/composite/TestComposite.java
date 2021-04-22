package CTS.Seminar5.composite;

public class TestComposite {
    public static void main(String[] args) {
        GrupCaractere grup1 = new GrupCaractere("Grup 1");
        grup1.adaugaNod(new CaracterNPC("Soldat 1", 100));
        grup1.adaugaNod(new CaracterNPC("Soldat 2", 100));

        GrupCaractere grup2 = new GrupCaractere("Grup 2");
        grup2.adaugaNod(new CaracterNPC("Soldat 3", 200));
        grup2.adaugaNod(new CaracterNPC("Tank", 500));

        GrupCaractere grupNivelJoc = new GrupCaractere("level 2");
        grupNivelJoc.adaugaNod(new CaracterNPC("Level Boss", 1000));
        grupNivelJoc.adaugaNod(grup1);
        grupNivelJoc.adaugaNod(grup2);

        grupNivelJoc.atacaJucator("thelegend27");
        grupNivelJoc.seRetrage();
        grupNivelJoc.getNod(0).seDeplaseaza();
    }
}
