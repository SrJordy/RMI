package Class;

import Interface.Product;
import Interface.ProductServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ImplProductServer extends UnicastRemoteObject implements ProductServer {

    private List<Product> productList;

    public ImplProductServer() throws RemoteException {
        productList = new ArrayList<>();
        //Agregar algunos productos

        productList.add(new ImplProduct("Telefono","Telefono inteligente",200.50 ));

        productList.add(new ImplProduct("Computador","Computador de sobremesa",500.60 ));

        productList.add(new ImplProduct("Parlante","Parlante grande",150.50 ));
    }


    @Override
    public List<Product> getProducts() throws RemoteException {
        return productList;
    }
}
