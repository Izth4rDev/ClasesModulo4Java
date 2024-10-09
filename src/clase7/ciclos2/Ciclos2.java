package clase7.ciclos2;

import java.util.Scanner;

public class Ciclos2 {
    public static void main(String[] args) {
        ////////DO WHILE/////////
        Scanner sc = new Scanner(System.in);

        int number;

        do{
            System.out.println("ingrese un 0 para salir del bucle");
            number = sc.nextInt();
            System.out.println("El numero ingresado es: " + number);
        }while(number!=0);
    }
}
