package CTS.Seminar9.dp.proxy;

public class ModulLogin implements InterfataModulLogin{

    String ipServer;
    int port;

    public ModulLogin(String ipServer, int port) {
        this.ipServer = ipServer;
        this.port = port;
    }

    @Override
    public boolean login(String username, String password) {
      return username.equals("admin") && password.equals("admin12");
    }

    @Override
    public boolean verificasStatusServer() {
       return true;
    }
}
