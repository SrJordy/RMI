import Interfaces.IPartida;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args ) throws IOException, NotBoundException, InterruptedException {

        Registry registry  = LocateRegistry.getRegistry("localhost", 8000);
        IPartida partida = (IPartida) registry.lookup("Partida");

        Scanner scanner = new Scanner (System.in);
        int playerId;
        long startTime = System.currentTimeMillis();
        char tecla;



        //Ingresar nombre del jugador
        System.out.print("Ingresa el nombre de tu jugador: ");
        String playerName = scanner.next();


        playerId = partida.setPlayer(playerName);

         scanner = new Scanner (System.in);

        while (true) {
            // Verifica si hay entrada disponible
            ClearScreenExample();

            System.out.println( "CUIDADO LOS ENEMIGOS !!!!!!!!! \n ");
            System.out.println( partida.getEnemy());
            System.out.println();

            System.out.println( partida.getPlayers());
            System.out.println( "Tu id de jugador es: " + playerId);


            System.out.println( "Presiona X para atacar al enemigo");


            if (partida.getWinner() != -1 ){
                ClearScreenExample();
                if (partida.getWinner() == playerId){
                    System.out.println( partida.getPlayers());
                    System.out.println( "Has ganado!!!!!!");
                }
                else{
                    System.out.println( partida.getPlayers());
                    System.out.println( "Has perdido !!!!!!"+ "El jugador "+ partida.getWinner() + "matado al dragón");
                }
                break;

            }
            tecla = scanner.next().charAt(0);

            if (tecla == 'x') {
                    partida.atackEnemy(playerId);

                } else {
                    ClearScreenExample();
                }

        }

    }



    public static void ClearScreenExample() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                // Manejar cualquier excepción
                e.printStackTrace();
            }
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

    }



}