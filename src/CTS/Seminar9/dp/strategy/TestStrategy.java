package CTS.Seminar9.dp.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ProfilPlayer player = new ProfilPlayer("Superman", 60, 5);

        player.setStrategieBonus(new StrategiePaste());
        player.getBonus();

        player.setStrategieBonus(new StrategieCraciun());
        player.getBonus();

        player.setStrategieBonus(new InterfataBonus() {
            @Override
            public int getPuncteBonus(ProfilPlayer player) {
                if (player.nrNiveluri > 3) {
                    return 30;
                }
                return 0;
            }
        });
    }
}
