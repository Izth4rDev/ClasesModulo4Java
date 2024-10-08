package clase6.ejercicioguiago2;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        //Declaracion de variables y objetos
        String password;
        Scanner sc = new Scanner(System.in);

        //Ingreso de la contraseña
        System.out.println("Ingrese la contraseña");
        password = sc.nextLine();

        //evaluar si la contraseña coincide
        while(!password.equals("holaJava")){ //<- para iterar sobre un
            //pedir la contraseña de nuevo cada vez que se equivoque
            System.out.println("Contraseña incorrecta !!!!");
            System.out.println("Ingrese la contraseña nuevamente");
            password = sc.nextLine();
        }

        System.out.println("acceso concedido");
    }
}
