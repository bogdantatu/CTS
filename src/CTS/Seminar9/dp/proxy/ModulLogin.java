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
        if(username.equals("admin") && password.equals("admin12"))
            return true;
        else
            return false;
    }

    @Override
    public boolean verificasStatusServer() {
       return true;
    }
}
