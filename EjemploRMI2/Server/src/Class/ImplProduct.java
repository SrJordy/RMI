package Class;

import Interface.Product;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplProduct extends UnicastRemoteObject implements Product {

    private String name;
    private String description;
    private double price;


    protected ImplProduct(String name, String description, Double price) throws RemoteException {
        this.name = name;
        this.description = description;
        this.price = price;

    }


    @Override
    public String getName() throws RemoteException {
        return name;
    }

    @Override
    public String getDescription() throws RemoteException {
        return description;
    }

    @Override
    public double getPrice() throws RemoteException {
        return price;
    }
}
