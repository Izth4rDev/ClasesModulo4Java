package clase4.condicionales;

public class Condicional {
    public static void main(String[] args) {
        //Operadores condicionales
        int numero1 = 10;
        int numero2 = 15;

        System.out.println("numero1 = numero2: " +(numero1 == numero2));
        System.out.println("numero1 es distinto de numero2? " + (numero1 != numero2));
        System.out.println("numero1 es mayor que numero2? " +   (numero1 > numero2));
        System.out.println("numero1 es menor que numero2? " +   (numero1 < numero2));
        System.out.println("numero1 es mayor o igual que numero2? " +   (numero1 >= numero2));
        System.out.println("numero1 es menor o igual que numero2? " +   (numero1 <= numero2));

        //Error comun al confundir comparador y asignacion

        int numero3 = 20; //<- asignacion de valor a una variable

        System.out.println("2 es igual que 3? " +(2 == 3)); //<-comparacion entre dos variables o valores

        //Condicional simple

        int edad = 15;

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }

        //Condicional alternativa if else
        if(edad >= 18){
            System.out.println("puedes beber alcohol");
        }else{
            System.out.println("eres menor de edad");
        }

        //Condicional multiple
        int nota = 75;

        if(nota>= 90){
            System.out.println("La calificacion en escala americana es A");
        }else if(nota>= 80){
            System.out.println("La calificacion en escala americana es B");
        }else if(nota >= 70){
            System.out.println("La calificacion en escala americana es C");
        }else{
            System.out.println("La calificacion en escala americana es D");
        }

    }
}
