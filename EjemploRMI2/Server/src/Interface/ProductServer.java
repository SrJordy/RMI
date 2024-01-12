package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductServer extends Remote {
    List<Product> getProducts () throws RemoteException;

}
