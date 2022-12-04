package batallanaval;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class BatallaNaval {

    public static void main(String[] args) {
        
        //Definimos los nombres para los jugadores
        
        System.out.println("Digite su nombre jugador 1");
        Scanner player1 = new Scanner (System.in);
        String namePlayer1 = player1.nextLine();
        
        System.out.println("Digite su nombre jugador 2");
        Scanner player2 = new Scanner (System.in);
        String namePlayer2 = player2.nextLine();
        
        //System.out.println(namePlayer1);
        //System.out.println(namePlayer2);
        
        //Create the match camp
        
        System.out.println("Ingresen el tablero de N*N");
        Scanner tablero = new Scanner (System.in);
        int tableroCompleto = tablero.nextInt();
        
        int tablerinPlayer1[][] = new int[tableroCompleto][tableroCompleto];
        int tablerinPlayer2[][] = new int[tableroCompleto][tableroCompleto];
        
        for (int i = 0; i < tableroCompleto; i++) {
            for (int j = 0; j < tableroCompleto; j++) {
                System.out.print(" x ");
            }
            System.out.println("");
        }
        
        //igualamos una lista al tamanio del arreglo
        
        int igualacion = tableroCompleto*tableroCompleto;
        
        List<Integer> fakeTablero = new ArrayList<Integer>();
        
        for (int i = 0; i < igualacion; i++) {
            fakeTablero.add(i);
        }
        
        //hacemos las litas para losjugadores
        
        int igualacion2 = tableroCompleto*tableroCompleto;
        
        List<Integer> fakeTablero2 = new ArrayList<Integer>();
        
        for (int i = 0; i < igualacion2; i++) {
            fakeTablero2.add(i);
        }
        
        int tamanio = fakeTablero.size();
        System.out.println(tamanio);
       
        //Hacemos los barcos para cada jugador
        
        System.out.println(namePlayer1 + " Digite el numero de barcos que deseas");
        System.out.println(namePlayer1 + " Solo del 1-5");
        Scanner navPlayer1 = new Scanner (System.in);
        int noBarquitos = navPlayer1.nextInt();
        
        int noBarquitosU1;
        noBarquitosU1 = noBarquitos - 1;
        
        for (int i = 0; i < noBarquitosU1; i++) {
            System.out.println("Barco de longitud " + i);
            
            System.out.println("Ingrese casilla para colocarlo");
            Scanner posisionBarco = new Scanner(System.in);
            int barcoColocado = posisionBarco.nextInt();
            
            System.out.println("Vertical u Horizontal?");
            System.out.println("V = vertical");
            System.out.println("H = horizontal");
            Scanner posiDif = new Scanner(System.in);
            String leerPosision = posiDif.nextLine();
            
            //Le sumamos el valor del tablaro es decir
            //Si es 5*5 le sumara 5
            //Colocando ahi el resto del barco
            //Haciendo una posicion vertical perfecta
            
            if (leerPosision == "v" || leerPosision == "V") {
                for (int j = 0; j < i; j++) {
                    fakeTablero.set(barcoColocado,(0));
                    if (barcoColocado>=2) {
                        for (int k = 0; k < barcoColocado; k++) {
                            int n;
                            n = barcoColocado + tableroCompleto;
                            fakeTablero.set(barcoColocado,(n));
                        }
                    }
                }
            }
            
            if (leerPosision == "h" || leerPosision == "H") {
                for (int j = 0; j < i; j++) {
                    fakeTablero.set(barcoColocado,(0));                    
                }
            }
            
        }
        
        //Falta que muestre en la matriz de x donde estan los barcos
        
        System.out.println(namePlayer2 + " Digite el numero de barcos que deseas");
        System.out.println(namePlayer2 + " Solo del 1-5");
        Scanner navPlayer2 = new Scanner (System.in);
        int noBarquitos2 = navPlayer2.nextInt();
        
        int noBarquitosU2;
        noBarquitosU2 = noBarquitos - 1;
        
        for (int i = 0; i < noBarquitosU2; i++) {
            System.out.println("Barco de longitud " + i);
            
            System.out.println("Ingrese casilla para colocarlo");
            Scanner posisionBarco = new Scanner(System.in);
            int barcoColocado = posisionBarco.nextInt();
            
            System.out.println("Vertical u Horizontal?");
            System.out.println("V = vertical");
            System.out.println("H = horizontal");
            Scanner posiDif = new Scanner(System.in);
            String leerPosision = posiDif.nextLine();
            
            //Le sumamos el valor del tablaro es decir
            //Si es 5*5 le sumara 5
            //Colocando ahi el resto del barco
            //Haciendo una posicion vertical perfecta
            
            if (leerPosision == "v" || leerPosision == "V") {
                for (int j = 1; j < i; j++) {
                    fakeTablero2.set(barcoColocado,(0));
                    if (barcoColocado>=2) {
                        for (int k = 0; k < 10; k++) {
                            int n;
                            n = barcoColocado + tableroCompleto;
                            fakeTablero2.set(barcoColocado,(n));
                        }
                    }
                }
            }
            
            if (leerPosision == "h" || leerPosision == "H") {
                for (int j = 0; j < i; j++) {
                    fakeTablero2.set(barcoColocado,(0));                    
                }
            }
            
        }
        
        //Falta que muestre en la matriz de x donde estan los barcos
        
        //Segun la longitud de los barcos sumarla
        //Si por ejemplo tengo dosbarcos de 1 y 2
        //La suma sera 3
        //Hago una variable que si el ataqque en la lista es igual a cer le reste uno
        //Si este contador llega a cero acaba el juego
        
        do {            
            
            System.out.println("Jugador: " + player1);
            System.out.println("Digite la casilla a atacar");
            Scanner readAtaque = new Scanner(System.in);
            int ataque = readAtaque.nextInt();
            
            if (ataque == 0) {
                
            }
            
        } while (noBarquitos == 0 || noBarquitos2 == 0);
            
    }
    
    public static void contadorBarcos(int numeracionDamage){
        
        System.out.println("Cuantos barcos tienes? ");
        Scanner barcosTotales = new Scanner(System.in);
        
    }
    
}
