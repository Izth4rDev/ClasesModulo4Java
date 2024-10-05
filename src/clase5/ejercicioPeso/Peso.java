package clase5.ejercicioPeso;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        //Crear un escáner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        //Solicitar al usuario que ingrese el peso del producto
        System.out.println("Ingrese el peso del producto (en kilogramos): ");
        double peso = sc.nextDouble();

        //Clasificación del producto según el peso
        if (peso == 1.0) {
            System.out.println("Producto de peso estándar");
        } else if (peso > 1.0) {
            System.out.println("Producto pesado");
        } else if (peso < 1.0) {
            if (peso >= 0.5) {
                System.out.println("Producto liviano");
            } else if (peso > 0 && peso < 0.5) {
                System.out.println("Producto muy liviano");
            } else {
                System.out.println("Peso no válido");
            }
        }
    }
}
