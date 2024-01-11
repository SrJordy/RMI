
package Server;

import RMI.RemoteInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{

    public ServerImplements() throws RemoteException{
        super();
    }
    @Override
    public int suma(int x, int y){
        return(x+y);
    }
    public int resta(int x, int y){
        return(x-y);
    }
    public int multiplica(int x, int y){
        return(x*y);
    }
    public int divide(int x, int y){
        return(x/y);
    }
}
