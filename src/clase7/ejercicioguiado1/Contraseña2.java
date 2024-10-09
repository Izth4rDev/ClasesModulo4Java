package clase7.ejercicioguiado1;

import java.util.Scanner;

public class Contraseña2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "holaJava";
        String password;
        int attempts = 0;
        int maxAttempts = 3;

        do{
            System.out.println("Ingrese la contraseña");
            password = sc.nextLine();
            attempts++;

            if(password.equals(correctPassword)){
                System.out.println("Acceso concedido!");
                break;
            }else{
                System.out.println("Contraseña incorrecta");
                System.out.println("Intentos restantes" + (maxAttempts - attempts));
            }
            System.out.println();
        }while(attempts < maxAttempts);

        if(!password.equals(correctPassword)){
            System.out.println("Acceso denegado, has alcanzado el maximo de intentos");
        }

    }
}