package clase4.ejerciciopropuesto5;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        System.out.println("Ingrese la temperatura");
        temperatura = sc.nextDouble();

        if(temperatura>30){
            System.out.println("hace mucho calor");
        }else if(temperatura>=21){
            System.out.println("El clima es calido");
        }else if(temperatura >= 10){
            System.out.println("el clima es templado");
        }else if(temperatura >=0){
            System.out.println("El clima es frio");
        }else{
            System.out.println("hace mucho frio");
        }
    }
}
