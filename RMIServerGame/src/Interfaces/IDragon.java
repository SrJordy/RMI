package Interfaces;

import jdk.jshell.ImportSnippet;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDragon extends Remote {
     float getHealf() throws RemoteException;
      void atack() throws  RemoteException;
}
