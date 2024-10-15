package clase10.ejemplopractico4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Creacion de un arraylist
        ArrayList<String> nombres = new ArrayList<>();

        //Agregar elementos a un arraylist
        nombres.add("Juan");
        nombres.add("Miguel");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Henry");

        //mostrar un arraylist
        System.out.println(nombres);

        //inserta el valor en la posicion y desplaza el valor actual a la siguiente poscicion
        nombres.add(2,"Gabriela");
        System.out.println(nombres);

        //Acceder un elemento en una posicion especifica
        String nombre1 = nombres.get(2);
        System.out.println(nombre1);

        //modificar un elemento
        nombres.set(1, "Francisco");
        System.out.println(nombres);

        //verifica que un elemento se encuentre en el Arraylist
        boolean existe = nombres.contains("Francisco");
        System.out.println(existe);

        //Tamaño del arraylist
        int tamano = nombres.size();
        System.out.println(tamano);

        //recorrer un arraylist
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        //ordenar un arraylist
        Collections.sort(nombres);
        System.out.println(nombres);
        //ordenar un arraylist descendente
        Collections.sort(nombres, Collections.reverseOrder());
        System.out.println(nombres);

        //Eliminar un elemento del arraylist
        nombres.remove(5);
        System.out.println(nombres);

        //Eliminar todos los elementos del arraylist
        nombres.clear();
        System.out.println(nombres);

        //Biblioteca Streams
            //->.filter
            //->.map

    }
}
