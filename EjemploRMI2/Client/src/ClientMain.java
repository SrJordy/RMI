import Interface.Product;
import Interface.ProductServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 8000);
            ProductServer productServer = (ProductServer) registry.lookup("ProductServer");

            List<Product> products = productServer.getProducts();

            System.out.println("Productos abilitados:");
            for (Product product : products) {
                System.out.println("Nombre: " + product.getName());
                System.out.println("Descripcion: " + product.getDescription());
                System.out.println("Precio: $" + product.getPrice());
                System.out.println("------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}