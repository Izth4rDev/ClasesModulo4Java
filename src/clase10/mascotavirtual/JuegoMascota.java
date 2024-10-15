package clase10.mascotavirtual;

import java.util.Scanner;

public class JuegoMascota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego, Ingresa el nombre de tu mascota");
        String nombre = sc.nextLine();
        Mascota sansa = new Mascota(nombre);

        do{
            System.out.println("Que deseas hacer con: " + sansa.getNombre() + " ?");
            System.out.println("1- Alimentar");
            System.out.println("2- Jugar");
            System.out.println("3- Dormir");
            System.out.println("4- Ver estado de mi mascota");
            System.out.println("5- Salir del juego");

            int opcion = sc.nextInt();

            switch(opcion){
                case 1: sansa.alimentar();
                break;
                case 2: sansa.jugar();
                break;
                case 3: sansa.dormir();
                break;
                case 4: sansa.estado();
                break;
                case 5:
                    System.out.println("gracias por jugar, saliendo del juego");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }

            //Actualizar el estado de la mascota
            sansa.setEnergia(sansa.getEnergia()-5);
            sansa.setFelicidad(sansa.getFelicidad()-5);
            sansa.setHambre(sansa.getHambre()-5);

            if(!sansa.estaVivo()){
                System.out.println("no se siente bien " + sansa.getNombre());
            }

        }while(sansa.estaVivo());

        System.out.println("Lo siento, " + sansa.getNombre() + "ha dejado de jugar");

    }
}
