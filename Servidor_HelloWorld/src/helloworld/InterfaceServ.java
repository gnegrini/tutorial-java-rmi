package helloworld;

import java.rmi.*;


public interface InterfaceServ extends Remote {
  
    public void registrarInteresse(String texto, InterfaceCli referenciaCliente) throws RemoteException;
    

}