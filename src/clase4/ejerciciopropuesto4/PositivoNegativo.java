package clase4.ejerciciopropuesto4;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        //Evaluacion de la condicion
        if(numero>0){
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }
    }
}
