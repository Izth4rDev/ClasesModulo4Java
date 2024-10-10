package clase8.ejercicioz;

import java.util.Scanner;

public class EjercicioZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del patron");
        int tam = sc.nextInt();

        //cuadrado con los valores i y j
        for(int i = 1; i <= tam; i++) {
            for(int j = 1; j <= tam; j++) {
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }

        //Patron de la Z
        for(int i = 1; i <= tam; i++) {
            for(int j = 1; j <= tam; j++ ) {
               if(i==1 || i == tam || i == tam-j+1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
