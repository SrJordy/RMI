import Interface.ProductServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Class.ImplProductServer;

public class ServerMain {
    public static void main(String[] args) {
        try {
            ProductServer productServer = new ImplProductServer();
                Registry registry = LocateRegistry.createRegistry(8000);
                registry.rebind("ProductServer", productServer);
                System.out.println("Server iniciado en el puerto 8000 ......");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}