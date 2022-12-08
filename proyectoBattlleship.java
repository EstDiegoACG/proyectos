package batallanaval5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class BatallaNaval5 {

    public static void main(String[] args) {
        
        //Definimos los nombres para los jugadores
        
        System.out.println("Digite su nombre jugador 1");
        Scanner player1 = new Scanner (System.in);
        String namePlayer1 = player1.nextLine();
        
        System.out.println("Digite su nombre jugador 2");
        Scanner player2 = new Scanner (System.in);
        String namePlayer2 = player2.nextLine();
        
        //Hacer el tablero
        
        System.out.println("Digite el numero de filas");
        Scanner readFilas = new Scanner (System.in);
        int filas = readFilas.nextInt();
        
        System.out.println("Digite el numero de columnas");
        Scanner readColumnas = new Scanner (System.in);
        int columnas = readColumnas.nextInt();
        
        int auxiliar = columnas * filas;
        
        //Hacemos la matriz
        
        int tableroPrincipal[][] = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" x ");
            }
            System.out.println(" ");
        }
        
        
        //Cominza eleccion de barcos
        System.out.println(namePlayer1 +" Elija sus barcos");
        
        int lancha = 1;
        int patrulla = 2;
        int destructor = 3;
        int Crucero = 4;
        int portaAviones = 5;
        
        int lanchaP1;
        int patrullaP1;
        int destructorP1;
        int cruceroP1;
        int portaAvionesP1;
        
        //Lancha
        System.out.println("Desea una lancha?");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readLanch = new Scanner(System.in);
        int lanch = readLanch.nextInt();
        
        if (lanch == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posLanch = new Scanner(System.in);
            lanchaP1 = posLanch.nextInt();
        }
        
        //Patrulla
        System.out.println("Desea una patrulla");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readPatrol = new Scanner(System.in);
        int patrol = readPatrol.nextInt();
        
        if (patrol == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posPatrol = new Scanner(System.in);
            patrullaP1 = posPatrol.nextInt();
        }
        
        //Destructor
        System.out.println("Desea un destructor");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readDestroy = new Scanner(System.in);
        int destroy = readDestroy.nextInt();
        
        if (destroy == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posDestroy = new Scanner(System.in);
            destructorP1 = posDestroy.nextInt();
        }
        
        //Crucero
        System.out.println("Desea un crucero");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readCrucero = new Scanner(System.in);
        int cruzader = readCrucero.nextInt();
        
        if (cruzader == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posCrucero = new Scanner(System.in);
            cruceroP1 = posCrucero.nextInt();
        }
        
        //Crucero
        System.out.println("Desea un Porta Aviones");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readAviones = new Scanner(System.in);
        int portAviones = readAviones.nextInt();
        
        if (portAviones == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posAvion = new Scanner(System.in);
            portaAvionesP1 = posAvion.nextInt();
        }
        
        //Cominza eleccion de barcos
        System.out.println(namePlayer2 +" Elija sus barcos");
        
        int lancha2 = 1;
        int patrulla2 = 2;
        int destructor2 = 3;
        int Crucero2 = 4;
        int portaAviones2 = 5;
        
        int lanchaP2;
        int patrullaP2;
        int destructorP2;
        int cruceroP2;
        int portaAvionesP2;
        
        //Lancha
        System.out.println("Desea una lancha?");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readLanch2 = new Scanner(System.in);
        int lanch2 = readLanch2.nextInt();
        
        if (lanch2 == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posLanch2 = new Scanner(System.in);
            lanchaP2 = posLanch2.nextInt();
        }
        
        //Patrulla
        System.out.println("Desea una patrulla");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readPatrol2 = new Scanner(System.in);
        int patrol2 = readPatrol2.nextInt();
        
        if (patrol2 == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posPatrol2 = new Scanner(System.in);
            patrullaP2 = posPatrol2.nextInt();
        }
        
        //Destructor
        System.out.println("Desea un destructor");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readDestroy2 = new Scanner(System.in);
        int destroy2 = readDestroy2.nextInt();
        
        if (destroy2 == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posDestroy2 = new Scanner(System.in);
            destructorP2 = posDestroy2.nextInt();
        }
        
        //Crucero
        System.out.println("Desea un crucero");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readCrucero2 = new Scanner(System.in);
        int cruzader2 = readCrucero2.nextInt();
        
        if (cruzader2 == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posCrucero2 = new Scanner(System.in);
            cruceroP2 = posCrucero2.nextInt();
        }
        
        //Crucero
        System.out.println("Desea un Porta Aviones");
        System.out.println("0 = no");
        System.out.println("1 = si");
        Scanner readAviones2 = new Scanner(System.in);
        int portAviones2 = readAviones2.nextInt();
        
        if (portAviones2 == 1) {
            System.out.println("Digite la posicion de 1 a " + auxiliar);
            Scanner posAvion2 = new Scanner(System.in);
            portaAvionesP2 = posAvion2.nextInt();
        }
        
        System.out.println("__________________");
        System.out.println("Hora de atacar");
        System.out.println("__________________");
        
        do {            
            
             
            
        } while (true);
        
    }
    
}
