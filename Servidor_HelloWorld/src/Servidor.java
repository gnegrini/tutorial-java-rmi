import java.rmi.RemoteException;
import java.rmi.registry.*;

import helloworld.*;

public final class Servidor {

    static int portaSN = 1099;

    public static void main(String[] args) {

        try {
            Registry referenciaServicoNomes = LocateRegistry.createRegistry(portaSN);
            
            InterfaceServ referenciaServidor = new ServImpl();
            
            referenciaServicoNomes.rebind("HelloWorld", referenciaServidor);

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
