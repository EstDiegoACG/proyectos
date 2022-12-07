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
        System.out.println("Longitud -1 = 1 barco");
        System.out.println("Longitud 0 = 2 barco");
        System.out.println("Longitud 1 = 3 barco");
        System.out.println("Longitud 2 = 4 barco");
        System.out.println("Longitud 3 = 5 barco");
        Scanner navPlayer1 = new Scanner (System.in);
        int noBarquitos = navPlayer1.nextInt();
        
        for (int i = -1; i < noBarquitos; i++) {
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
        System.out.println("Longitud -1 = 1 barco");
        System.out.println("Longitud 0 = 2 barco");
        System.out.println("Longitud 1 = 3 barco");
        System.out.println("Longitud 2 = 4 barco");
        System.out.println("Longitud 3 = 5 barco");
        Scanner navPlayer2 = new Scanner (System.in);
        int noBarquitos2 = navPlayer2.nextInt();
        
        for (int i = -1; i < noBarquitos2; i++) {
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
        
        int noBarcos1, noBarcos2;
        
        noBarcos1 = noBarquitos;
        noBarcos2 = noBarquitos2;
        
        do {            
            
            System.out.println("Jugador: 1");
            System.out.println("Digite la casilla a atacar");
            Scanner readAtaque = new Scanner(System.in);
            int ataque = readAtaque.nextInt();
            fakeTablero2.get(ataque);
            
            if (fakeTablero2.get(ataque) == 0) {
                int restaBarcos;
                restaBarcos = noBarcos2 -1;
            }
            
            //TODO imprimir la matriz con algun numero para idetificar:
            //barcos
            //Lugar atacado
            //Lugar acertado
            
            System.out.println("Jugador: 2");
            System.out.println("Digite la casilla a atacar");
            Scanner readAtaque2 = new Scanner(System.in);
            int ataque2 = readAtaque2.nextInt();
            fakeTablero.get(ataque2);
            
            if (fakeTablero2.get(ataque2) == 0) {
                int restaBarcos;
                restaBarcos = noBarcos1 -1;
            }
            
            //TODO imprimir la matriz con algun numero para idetificar:
            //barcos
            //Lugar atacado
            //Lugar acertado
            
        } while (noBarcos1 == 0 || noBarcos2 == 0);
            
    }
    
    //Olvide que iba hacer una funcion xd
    
    public static void contadorBarcos(int numeracionDamage){
        
        System.out.println("Quieres iniciar el juego");
        Scanner barcosTotales = new Scanner(System.in);
        
    }
    
}

/*When haces tus momos en java
    El futuro es hoy xd*/