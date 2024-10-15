package clase10.ejemplopractico1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //declaracion
        int [] valores;
        //inicializacion
        valores = new int[5]; //<--el tamaño del arreglo

        //Declaracion + Inicializacion
        int [] valores2 = new int[5];

        //Declaracion, inicializacion y asignacion combinado
        int [] valores3 = {2,3,66,77,21};

        //asignarle valores a un arreglo
        valores2 [0] = 2;
        valores2 [1] = 3;
        valores2 [2] = 6;
        valores2 [3] = 7;
        valores2 [4] = 8;

        for(int i = 0; i<valores2.length; i++){
            System.out.println(valores2[i]);
        }

        //Llenando un arreglo de manera dinamica
        int [] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<numeros.length; i++){
            System.out.println("ingrese un numero");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


    }
}
