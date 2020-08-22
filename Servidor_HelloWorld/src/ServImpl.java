import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

import helloworld.*;

public class ServImpl extends UnicastRemoteObject implements InterfaceServ {

    public ServImpl() throws RemoteException{}

    private static final long serialVersionUID = 1L;

    @Override
    public void registrarInteresse(String texto, InterfaceCli referenciaCliente) throws RemoteException {
        try {
            referenciaCliente.notificar("Novo cliente registrado: " + texto);
        } catch (RemoteException e) {
        
            e.printStackTrace();
        }
    }
}
