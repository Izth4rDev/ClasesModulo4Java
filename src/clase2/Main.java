package clase2;

public class Main{
    public static void main(String[] args) {

        /*System.out.println("hola mundo");
        System.out.println("me llamo Miguel");

        System.out.println("\033[0;31m Este mensaje esta en rojo");
        System.out.println("\033[0;32m Este mensaje esta en verde");
        System.out.println("\033[0;33m texto en amarillo");
        System.out.println("\033[0;34m texto en azul");
        System.out.println("\033[0;35m texto en morado");
        System.out.println("\033[0;36m texto en cyan");
        System.out.println("\033[0;37m texto en gris");
        System.out.println("\033[0m por defecto");*/

        //variables
        int nota1 = 7;
        int  a = 7;
        int notaMatematica1 = 6;

        //contantes
        final double PI = 3.14;

        String nombre = "Miguel";
        String nombre2 = null;

        //tipos de datos primitivos
        short number1 = 2;
        int number2 = 2;
        long number3 = 2L;
        float number4 = 2.4f;
        char letra = 'A';
        boolean isFalse = false;
        int numbers[]  = {1,2,3,4};

        //Tipos de datos no primitivos
        Integer numero1 = 25;
        Float numero2 = 2f;
        Long numero3 = 2L;
        Double numero4 = 2d;
        Boolean isTrue = true;

        //buenas practicas al definir variables
        String segundoNombre;
        boolean isGenius;
        int numero5;

        //asginar valores a una variable
        numero5 = 35;
        nombre2 = "Julio";

        //mostrar el valor de la variable por la consola
        /*System.out.println(nombre2);
        System.out.println(numero5);*/


        //************************************************
        //Concatenar valores por la consola
        String primerNombre = "Miguel";
        String apellido = "Rondanelli";
        int edad = 35;

        System.out.println("Mi nombre es: " + primerNombre);
        System.out.println("Mi nombre es: " + primerNombre +" "+"mi apellido es: " + apellido +" "+"Mi edad es: " + edad);

        /*Mensaje del ejercicio
        “Mi nombre es: variable1 y estoy aprendiendo java, mi edad es variable2”*/
        //************************************************


        //Metodos de la clase String
        String texto = "hola universo";
        String texto2 ="";
        int longitud = texto.length(); //Devuelve la longitud del stringSystem.out.println("longitud del texto es: " + longitud);
        String textoCortado = texto.substring(0,13); // Devuelve una subcadena del string original
        System.out.println("textoCortado es: " + textoCortado);
        String textoMayuscula = texto.toUpperCase(); // Devuelve el string original mayucula
        System.out.println("textoMayuscula es: " + textoMayuscula);
        String textoMinuscula = texto.toLowerCase();
        System.out.println("textoMinuscula es: " + textoMinuscula);
        boolean estaVacio = texto.isEmpty(); //Verifica que la variable contengo algun valor
        System.out.println("Esta vacio es: " + estaVacio);
        boolean estaVacio2 = texto2.isEmpty();
        System.out.println("Esta vacio2 es: " + estaVacio2);
        String textoRemplazado = texto.replace("hola","chao"); //Remplaza un valor dentro de la cadena de String por otro
        System.out.println("textoRemplazado es: " + textoRemplazado);
        char letra2 = texto.charAt(3); // Devuelve el caracter en la posicion dentro de la cadena String
        System.out.println("letra2 es: " + letra2);

        //metodos de Integer
        Integer valorComparar2 = 100;
        int valor1 = valorComparar2.intValue(); //convierte un integer no primitivo a uno primitivo
        String valorEnString = valorComparar2.toString();
        System.out.println("valorEnString es: " + valorEnString);
        int comparacion = valorComparar2.compareTo(250); //Compara un integer con otro valor numerico (-1, 0 , 1)
        System.out.println(comparacion);

    }
}