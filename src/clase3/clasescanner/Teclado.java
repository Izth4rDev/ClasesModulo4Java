package clase3.clasescanner;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        //Clase Scanner
        // metodo nextLine()
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);

        //metodo next();
        /*String apellido;
        System.out.println("Escribe tu apellido");
        apellido = scanner.next();
        System.out.println("El apellido ingresado es: " + apellido);*/

        //metodo nextInt()
        int edad;
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();
        System.out.println("El edad es: " + edad);

        //metodo nextDouble()
        double altura;
        System.out.println("Escribe tu altura");
        altura = scanner.nextDouble();
        System.out.println("El altura es: " + altura);

        //metodo nextBoolean
        boolean mayorEdad;
        System.out.println("eres mayor de edad?");
        mayorEdad = scanner.nextBoolean();
        System.out.println("es mayor de edad? " + mayorEdad);

    }
}
