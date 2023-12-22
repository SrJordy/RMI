import Clases.Dragon;
import Clases.Partida;
import Interfaces.IDragon;
import Interfaces.IPartida;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(8000);
        IPartida partida = new Partida();
        registry.rebind("Partida", partida);
        System.out.println("Se ha inicializado el servidor");



    }
}