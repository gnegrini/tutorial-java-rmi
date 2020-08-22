import java.rmi.registry.*;

import helloworld.*;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        Registry referenciaServicoNomes = LocateRegistry.getRegistry();

        InterfaceServ referenciaServidor = (InterfaceServ) referenciaServicoNomes.lookup("HelloWorld");

        InterfaceCli cliente = new CliImpl(referenciaServidor);    
        
    }
}
