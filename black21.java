import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int player1, player2;
        ArrayList<Integer> cartas = new ArrayList<Integer>();

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                cartas.add(i);
            }
        }

       /*for (int i = 0; i < 28; i++) {
        System.out.println(cartas.get(i));
       }*/

       //Arriba solo comprobe que ya esten bien las cartas
    
            System.out.println("Turno del Jugador: 1");

            for (int j = 0; j < 3; j++) {
    
                Random cartasRandom = new Random();
                int mazo;
                mazo = cartasRandom.nextInt(28);

                System.out.println(cartas.get(mazo));

                //Me falta la suma

            } 

            System.out.println("Digete el total de su suma");
            Scanner confirmacion = new Scanner(System.in);
            int okConfirmo = confirmacion.nextInt();

            System.out.println("Su suma es:" + okConfirmo);

            //Abajo iba a poner la variable de la suma
        if () {
            
        }

    }
}
