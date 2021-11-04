package EjerciciosPratica7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

    public static String ingresarMensaje (String mensaje){

        Scanner input = new Scanner(System.in);

        mensaje = input.next();
        System.out.println(mensaje);

        return mensaje;

    }

    public static int ingresarNumero (String mensaje){

        Scanner input = new Scanner (System.in);
        System.out.println(mensaje);
        int num = 0;
        try{
            num = input.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("No se ha introducido un numero");
        }catch (Exception ex){
            System.out.println("Ha ocurrido un error");
        }
        return num;
    }


}
