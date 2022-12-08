ackage batallanaval4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class BatallaNaval4 {

    public static void main(String[] args) {
        
        //Definimos los nombres para los jugadores
        
        System.out.println("Digite su nombre jugador 1");
        Scanner player1 = new Scanner (System.in);
        String namePlayer1 = player1.nextLine();
        
        System.out.println("Digite su nombre jugador 2");
        Scanner player2 = new Scanner (System.in);
        String namePlayer2 = player2.nextLine();
        
        //Definir el tablero
        System.out.println("Ingresen el tablero de N*N");
        Scanner tablero = new Scanner (System.in);
        int tableroCompleto = tablero.nextInt();
        
        int tablerinPlayer1[][] = new int[tableroCompleto][tableroCompleto];
        int tablerinPlayer2[][] = new int[tableroCompleto][tableroCompleto];
        
        //Hacemos un auxiliar para despues
        
        int auxiliar;
        auxiliar = tableroCompleto * tableroCompleto;
        
        //imprimir el tablero
        
        for (int i = 0; i < tableroCompleto; i++) {
            for (int j = 0; j < tableroCompleto; j++) {
                System.out.print(" x ");
            }
            System.out.println("");
        }
        
        //Hacer la lista para el primer jugador
        
        List<Integer> listaP1 = new ArrayList<Integer>();
        
        //Definir el numero de barcos
     
        System.out.println(namePlayer1 + "Digite sus barcos");
        Scanner readBarcos1 = new Scanner(System.in);
        int barcosP1 = readBarcos1.nextInt();
        
        for (int i = 0; i < barcosP1; i++) {
            
            System.out.println("Barco de: " + i + "casillas");
            System.out.println("Ingrese la posision");
            Scanner posicionBarco = new Scanner(System.in);
            int barcoColocado = posicionBarco.nextInt();
            
            listaP1.add(1);
            //System.out.println(listaP1.size());
            //System.out.println(listaP1.get(i));
            
        }
        
        for (int i = 0; i < 100; i++) {
            listaP1.add(0);
        }
        
        //Hacer la lista para el segundo jugador
        
        List<Integer> listaP2 = new ArrayList<Integer>();
        
        //Definir el numero de barcos
     
        System.out.println(namePlayer2 + "Digite sus barcos");
        Scanner readBarcos2 = new Scanner(System.in);
        int barcosP2 = readBarcos1.nextInt();
        
        for (int i = 0; i < barcosP2; i++) {
            
            System.out.println("Barco de: " + i + "casillas");
            System.out.println("Ingrese la posision");
            Scanner posicionBarco2 = new Scanner(System.in);
            int barcoColocado2 = posicionBarco2.nextInt();
            
            listaP2.add(1);
            //System.out.println(listaP2.size());
            //System.out.println(listaP2.get(i));
            
        }
        
        for (int i = 0; i < 100; i++) {
            listaP2.add(0);
        }
        
        //hacemos el limite de tiros
        int mundo;
        int puntos1;
        int puntos2;
        int auxiliar2;
       
        auxiliar2 = tableroCompleto * tableroCompleto;
        puntos1 = auxiliar2;
        puntos2 = auxiliar;
        
        int nose1;
        int nose2;
        
        List<Integer> municion = new ArrayList<Integer>();
        List<Integer> municion2 = new ArrayList<Integer>();
        
        for (int i = 0; i < auxiliar; i++) {
            municion.add(1);
        }
        
        System.out.println(municion.size());
        //System.out.println(listaP2.get(i));
        
        for (int i = 0; i < auxiliar; i++) {
            municion2.add(1);
        }
        
        System.out.println(municion2.size());
        //System.out.println(listaP2.get(i));
        
        //hacemos el ataque
        
        int noBarcos1 = barcosP1;
        int noBarcos2 = barcosP2;
        
        do {            
            
            //Ataque del primer jugador
            
            System.out.println(namePlayer1);
            System.out.println("Ingrese casilla a atacar");
            Scanner readAtaque = new Scanner(System.in);
            int ataque = readAtaque.nextInt();
            
            if (municion.get(ataque).equals(listaP2.get(ataque))) {
                System.out.println("Buen tiro");
                noBarcos2 --;
            } else {
                System.out.println("No");
            }
            
            //Ataque del segundo jugador
            
            System.out.println(namePlayer2);
            System.out.println("Ingrese casilla a atacar");
            Scanner readAtaque2 = new Scanner(System.in);
            int ataque2 = readAtaque2.nextInt();
            
            if (municion2.get(ataque2).equals(listaP1.get(ataque2))) {
                System.out.println("Buen tiro");
                noBarcos1 --;
            } else {
                System.out.println("No");
            }
            
        } while (noBarcos1 == 0 || noBarcos2 == 0);
        
    }
    
}