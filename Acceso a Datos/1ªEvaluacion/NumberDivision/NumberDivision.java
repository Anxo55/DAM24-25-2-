package NumberDivision;

import java.util.Scanner;

public class NumberDivision {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String numerador, denominador;
        boolean repetir = false;

    do {
            
       repetir = false; 
        try {
                
            System.out.println("Introduzca el numerador: ");
            numerador = sc.nextLine();
            int num1 = Integer.parseInt(numerador);

            System.out.println("Introduce el valor del denominador: ");
            denominador = sc.nextLine();
            int num2 = Integer.parseInt(denominador);

            double division = num1 / num2;
            System.out.println("El resultado de la division es: "+division);

        } catch (NumberFormatException e) {
            System.out.println("Has introducido un caracter");
            repetir  = true;
        }
    } while (repetir);

    }
    
}
