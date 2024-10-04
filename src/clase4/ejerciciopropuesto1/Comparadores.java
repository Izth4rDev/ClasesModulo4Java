package clase4.ejerciciopropuesto1;

import java.util.Scanner;

public class Comparadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println(numero1+" Es mayor que " + numero2 +" "+(numero1 > numero2));
    }
}
