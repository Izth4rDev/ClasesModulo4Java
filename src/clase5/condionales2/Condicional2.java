package clase5.condionales2;
import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        //condiciones anidadas
        //ejemplo 1
        int edad = 18;
        boolean tieneLicencia = true;

        if(edad>=18){
            if(tieneLicencia == true){
                System.out.println("Puede manejar");
            }else{
                System.out.println("no puede manejar");
            }
        }else{
            System.out.println("No tiene edad suficiente para poder manejar");
        }

        //ejemplo2
        boolean tieneCuenta = true;
        int puntos = 90;

        if(tieneCuenta == true){
            if(puntos>=100){
                System.out.println("puede usar sus puntos para canjear el producto");
            }else{
                System.out.println("no tiene los suficientes puntos para canjear el producto");
            }
        }else{
            System.out.println("porfavor create una cuenta de la tienda");
        }

        //Switch case
        //Menu de opciones

        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opcion");
        System.out.println("Opcion 1: iniciar el juego");
        System.out.println("Opcion 2: cargar partida guardada");
        System.out.println("Opcion 3: salir del juego");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Iniciando el juego.......");
                break;
            case 2:
                System.out.println("Cargando el juego");
                break;
            case 3:
                System.out.println("Saliendo del juego");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

        //Operador logicos
        // Operador AND
       int numero1 = 15;

        //evalua si un numero es divible por 3 "Y" ("AND") 5
        if(numero1%3==0 && numero1%5==0){
            System.out.println("Es divisible por 3 y por 5");
        }else{
            System.out.println("No es divisible por 3 y por 5");
        }

        //operador OR
        boolean esFeriado = true;
        boolean esFinDeSemana = true;

        if(esFeriado == true || esFinDeSemana == true){
            System.out.println("puedes descansar");
        }else{
            System.out.println("No puedes descansar te toca trabajar");
        }

        //NOT
        boolean esDenoche = false;

        if(!esDenoche){
            System.out.println("Es de dia");
        }else{
            System.out.println("Es de noche");
        }

        //Operador ternario
        int numero3 = 15;
        String tipoNumero = (numero3 % 2 == 0) ? "el numero par" : "el numero impar";
        System.out.println("El numero es: " + tipoNumero);

    }
}
