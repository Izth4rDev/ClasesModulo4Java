package clase10.ejemplopractico3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Declaracion de un arreglo bidimencional
        Integer[][] numeros = new Integer[4][4];

        //Declarar arrelgo inicializarlo y asignarle valores
        Integer [][] numeros2 = {
                {2,3,4},
                {5,6,7},
                {8,9,10}
        };

        //Acceder a los valores de una arreglo multidimencional
        System.out.println(numeros2[0][0]);
        System.out.println(numeros2[2][2]);


        System.out.println("valor de la columna" + numeros2[1].length);

        //Recorrer un arreglo multidimencional
        for(int i = 0; i< numeros2.length;i++){
            for(int j = 0; j< numeros2[i].length;j++){
                System.out.println(numeros2[i][j]);
            }
        }

        //metodo deepToString -> es un toString para arrays multidimencionales
        System.out.println(Arrays.deepToString(numeros2));

    }
}
