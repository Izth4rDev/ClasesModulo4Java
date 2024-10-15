package clase10.ejemplopractico2;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //creacion inicializacion y asignacion de valores del arreglo
        Integer[] numeros = {5,8,32,1,7};

        //convierte el arreglo en un string para ser mostrado por pantalla
        System.out.println(Arrays.toString(numeros));

        //Ordenar un arreglo
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //Ordenar en orden descendente
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));

        //Rellena el arreglo con un valor especifico
        Integer[] numero2 = new Integer[5];
        Arrays.fill(numero2, 5);
        System.out.println(Arrays.toString(numero2));

        //Verificar si dos arreglos son iguales
        boolean esIgual = Arrays.equals(numero2, numeros);
        System.out.println(esIgual);

        //Buscar un valor en el arreglo, este devuelve el indice del elemento si lo encontro
        //si el elemento no se encuentra en el arreglo va retornar un numero negativo -1
        Arrays.sort(numeros);
        int indice = Arrays.binarySearch(numeros, 5);
        System.out.println("el indice del valor 5 es: " + indice);
        System.out.println(Arrays.toString(numeros));

        //copia un arreglo en otro con el tamaño especificado
        Integer [] copia = Arrays.copyOf(numeros,7);
        System.out.println(Arrays.toString(copia));

        //copia un rango especifico del arreglo en otro arreglo
        Integer [] copiaRango = Arrays.copyOfRange(numeros,1,3);
        System.out.println(Arrays.toString(copiaRango));

    }
}
