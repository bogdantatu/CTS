package CTS.Seminar9.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin{

    InterfataModulLogin modulLogin = null;

    public static final int NR_MAX_INCERCARI = 3;
    public Map<String, Integer> nrIncercari = new HashMap<>();

    public ProxyLogin(InterfataModulLogin modulLogin) {
        super();
        this.modulLogin = modulLogin;
    }

    @Override
    public boolean login(String username, String password) {
        Integer nrIncercariNereusite = nrIncercari.get(username);
        if(nrIncercariNereusite == null){
            nrIncercari.put(username, 0);
            nrIncercariNereusite = 0;
        }
        if(modulLogin != null){
            if(nrIncercariNereusite < NR_MAX_INCERCARI) {
                if (modulLogin.login(username, password) == true)
                    return true;
                else {
                    nrIncercariNereusite += 1;
                    return false;
                }
            }
            else
                return false;
        }
    }

    @Override
    public boolean verificasStatusServer() {
       if(modulLogin!=null)
           return modulLogin.verificasStatusServer();
       else
           throw new UnsupportedOperationException();
    }
}
