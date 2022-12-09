package batallanaval6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class BatallaNaval6 {
    
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
        
        List<Integer> barcos1 = new ArrayList<Integer>();
        List<Integer> barcos2 = new ArrayList<Integer>();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" x ");
            }
            System.out.println(" ");
        }
        
        System.out.println(namePlayer1 + " Digite sus barcos");
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Digite posicion de barco" + i);
            Scanner readPosicion = new Scanner(System.in);
            int pocicion = readPosicion.nextInt();
            barcos1.add(pocicion);
            
        }
        
        System.out.println(namePlayer2 + " Digite sus barcos");
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Digite posicion de barco" + i);
            Scanner readPosicion = new Scanner(System.in);
            int pocicion = readPosicion.nextInt();
            barcos2.add(pocicion);
            
        }
        
        /*int prueba1 = barcos1.size();
        System.out.println(prueba1);
        
        int prueba2 = barcos2.size();
        System.out.println(prueba2);*/
        
        System.out.println("__________________");
        System.out.println("Hora de atacar");
        System.out.println("__________________");
        
        List<Integer> municion = new ArrayList<Integer>();
        List<Integer> municion2 = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            municion.add(1);
            municion2.add(1);
        }
        
        int n = 1;
        
        while (n<30) {            
            n++;
            
            try {
            System.out.println(namePlayer1 + "Digite casilla para atacar");
            Scanner readAtaque = new Scanner(System.in);
            int ataque = readAtaque.nextInt();
            municion.get(ataque);
            
                if (municion.get(ataque).equals(barcos2.get(ataque))) {
                    System.out.println("Buen tiro");
                }else{
                    System.out.println("Mal tiro");
                }
            
            
            System.out.println(namePlayer2 + "Digite casilla para atacar");
            Scanner readAtaque2 = new Scanner(System.in);
            int ataque2 = readAtaque2.nextInt();
            municion2.get(ataque);
         
                if (municion2.get(ataque).equals(barcos1.get(ataque))) {
                    System.out.println("Buen tiro");
                }else{
                    System.out.println("Mal tiro");
                }
                
            } catch (Exception e) {
            }
            
          
        }
        
    }
    
}