package clase3.ejercicioguiado1;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de radio: ");
        double radio = sc.nextDouble();

        double perimetro = 2 * PI * radio;

        System.out.printf("El valor del perimetro es %.2f", perimetro);
    }
}

