package clase4.ejerciciopropuesto3;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        //Ingresar un numero por consola y verificar si este es par
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        //verificacion
        if(numero%2 == 0){
            System.out.println("el numero es par");
        }
    }
}
