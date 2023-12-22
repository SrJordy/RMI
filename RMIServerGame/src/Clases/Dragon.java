package Clases;

import Interfaces.IDragon;

import javax.management.DescriptorRead;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Dragon        {

    String name;
    float health;


    public Dragon (String name , float vida) {
        this.name = name;
        this.health = vida;
    }


    public float getHealf()  {
        return this.health ;
    }

    public void atack() {
        this.health -= 10;
    }



}
