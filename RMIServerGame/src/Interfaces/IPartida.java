package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPartida extends Remote {
     int setPlayer( String name) throws RemoteException;
     int atackEnemy (int idPlayer) throws  RemoteException;
     String getPlayers() throws  RemoteException;
     String getEnemy() throws  RemoteException;
     int getNPlayers() throws  RemoteException;
     int getWinner() throws  RemoteException;






}
