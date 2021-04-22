package CTS.Seminar5.flyweight;

public class ContextEcran {
    int x;
    int y;
    String culoareTextura;

    public ContextEcran(int x, int y, String culoareTextura) {
        this.x = x;
        this.y = y;
        this.culoareTextura = culoareTextura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCuloareTextura() {
        return culoareTextura;
    }
}
