package CTS.Seminar9.dp.strategy;

public class ProfilPlayer {
    String username;
    double playTime;
    int nrNiveluri;

    InterfataBonus strategieBonus = null;

    public ProfilPlayer(String username, double playTime, int nrNiveluri) {
        this.username = username;
        this.playTime = playTime;
        this.nrNiveluri = nrNiveluri;
    }

    public void setStrategieBonus(InterfataBonus strategie){
        this.strategieBonus = strategie;
    }

    public void getBonus(){
        if (this.strategieBonus != null){
            int puncteBonus = this.strategieBonus.getPuncteBonus(this);
            System.out.println("Ai primit puncte bonus: " + puncteBonus);
            return;
        }
        throw new UnsupportedOperationException();
    }
}
