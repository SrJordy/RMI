package Clases;

import Interfaces.IPartida;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Partida extends UnicastRemoteObject implements IPartida {

    Dragon enemy;
    ArrayList<Player> players;

    int winner = -1 ;

    public Partida () throws  RemoteException{
        this.enemy = new Dragon(" Dragón Ochy", 100);
        players= new ArrayList<Player>();

    }
    @Override
    public int setPlayer( String name) throws RemoteException {
        players.add( new Player(this.players.size()+1, name, 1));
        return players.size();

    }


    @Override
    public int atackEnemy(int idPlayer) throws RemoteException {
        if (enemy.health > 0)
        {
            enemy.atack();
            if (enemy.health <= 0 )
                this.winner =  idPlayer;
            return  1;

        }
        return 0;


    }

    @Override
    public String getPlayers() throws RemoteException {
        String strPlayers = "JUGADORES: \n";

        for (int i = 0; i< this.players.size(); i++){
            strPlayers += "\t * " +this.players.get(i).id +"  ->   "  + this.players.get(i).name + "\n";
        }

        return strPlayers;
    }

    @Override
    public String getEnemy() throws RemoteException {
        return "ENEMIGO : \n\t" +this.enemy.name  + "\n\tVida :  " + this.enemy.health ;
    }

    @Override
    public int getNPlayers() throws RemoteException {
        return this.players.size();
    }

    @Override
    public int getWinner() throws RemoteException {
        return this.winner;
    }


}
