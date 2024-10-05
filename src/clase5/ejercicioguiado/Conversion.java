package clase5.ejercicioguiado;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        //definimos variables
        double euros = 0.91;
        double yen = 148.73;
        double libra = 0.76;
        double clp = 924.75;
        double resultado;

        //obtenemos los datos del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dolares a convertir");
        double cantidad = sc.nextDouble();

        //Menu
        System.out.println("Ingrese el tipo de moneda al que desea convertir");
        System.out.println("1 - euro");
        System.out.println("2 - yen");
        System.out.println("3 - libra");
        System.out.println("4 - clp");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                resultado = euros * cantidad;
                System.out.println("el resultado de dolares a euro es: " + resultado);
                break;
            case 2:
                resultado = yen * cantidad;
                System.out.println("el resultado de dolares a yen es: " + resultado);
                break;
            case 3:
                resultado = libra * cantidad;
                System.out.println("el resultado de dolares a libra es: " + resultado);
                break;
            case 4:
                resultado = clp * cantidad;
                System.out.println("el resultado de dolares a  clp es: " + resultado);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
