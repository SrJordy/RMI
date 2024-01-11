package Server;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class MainServer {
    public static void main (String args[]){
        try{
            Registry miRegistry=LocateRegistry.createRegistry(1234);
            miRegistry.rebind("Ejemplo Matematicas", (Remote) new ServerImplements());
            System.out.println("Servidor ON");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
