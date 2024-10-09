package clase7.patrones;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar el tamaño del patron");
        int number = sc.nextInt();

        //*****
        for(int i = 1; i<=number; i++){
            System.out.print("*");
        }

        System.out.println();

        // *||*||*||
        for(int i = 1; i<=number; i++){
           if(i%2==0){
               System.out.print("*");
           }else{
               System.out.print("||");
           }
        }

        System.out.println();

        //patron bidimencional
        //cuadrado rellenito
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //cuadrado relleno pero con los indices
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }

        //Cuadrado vacio
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                if(i == 1 || i == number || j ==1 || j == number){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
