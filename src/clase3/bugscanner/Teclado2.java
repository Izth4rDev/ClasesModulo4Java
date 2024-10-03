package clase3.bugscanner;

import java.util.Scanner;

public class Teclado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa la edad");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("ingrese el nombre");
        String nombre = sc.nextLine();

        System.out.println("edad: " + edad + " "+ "Nombre: " + nombre);
    }
}
