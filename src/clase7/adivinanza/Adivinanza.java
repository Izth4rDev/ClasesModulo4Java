package clase7.adivinanza;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        //Declaracion de variables y objetos
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int attempt;

        //generamos el numero aleatorio
        int randomNumber = rand.nextInt(50) + 1;

        System.out.println("Adivina el numero entre 1 y 50!!!!!!!!");

        //Ciclo
        do{
            System.out.println("Ingresa tu intento :) ");
            attempt = sc.nextInt();

            if(attempt < 1 || attempt > 50){
                System.out.println("El numero debe estar entre 1 y 50!!!!!!!!");
            }else if(attempt > randomNumber){
                System.out.println("El numero es menor");
            }else if(attempt < randomNumber){
                System.out.println("El numero es mayor");
            }else{
                System.out.println("Felicidades!! adivinaste el numero");
            }
        }while(attempt!=randomNumber);
    }
}
