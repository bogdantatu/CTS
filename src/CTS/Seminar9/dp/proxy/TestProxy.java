package CTS.Seminar9.dp.proxy;

public class TestProxy {
    public static void main(String[] args) {

        ModulLogin login = new ModulLogin("10.0.0.1", 127);
        if(login.login("admin", "admin12"))
            System.out.println("Hello, Admin!");

        String[] parole = new String[]{"1234", "123456", "admin", "root", "admin12"};

        for(String parola : parole ) {
            if(login.login("admin", parola))
                System.out.println(("Parola gasita: " + parola));
        }
    }
}
