package CTS.Seminar6.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        Model3DCaracter superDavid = new Model3DCaracter("fuchsia");
        Model3DCaracter superman = (Model3DCaracter) superDavid.clone();
    }
}
