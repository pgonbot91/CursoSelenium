package EjerciciosPratica7;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido");

        int [] arrayExcepciones = new int[4];

        arrayExcepciones[0] = 1;
        arrayExcepciones[1] = 2;
        arrayExcepciones[2] = 3;
        arrayExcepciones[3] = 4;

        System.out.println("Introduzca un numero");
        int pos = input.nextInt();



        try {
            System.out.println("------> " + arrayExcepciones[pos]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error. La ultima posición vale " + arrayExcepciones[arrayExcepciones.length -1]);
        }
        
        
        try{
            System.out.println("Introduzca el dividendo");
            int dividendo = input.nextInt();

            System.out.println("Introduzca el divisor");
            int divisor = input.nextInt();

            int division = dividendo/ divisor;

            System.out.println("El resultado de la división es" + division);
        }catch (ArithmeticException ex){
            System.out.println("Ha ocurrido una error de calculo");
        }catch (InputMismatchException ex){
            System.out.println("No se ha ingresado un numero");
        }catch (Exception ex){
            System.out.println("Ha ocurrido una excepción");
        }

        System.out.println("Hasta luego");


    }
}
