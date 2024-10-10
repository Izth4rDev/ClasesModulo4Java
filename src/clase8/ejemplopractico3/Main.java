package clase8.ejemplopractico3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto
        Person person1 = new Person("Miguel","Rondanelli",35,"Tocar el bajo");

        System.out.println("El nombre de la persona es: " + person1.name);
        System.out.println("El apellido de la persona es: "+ person1.lastName);
        System.out.println("La edad de la persona es: "+ person1.age);
        System.out.println("El Hobbie de la persona es: "+person1.hobbie);

    }
}
