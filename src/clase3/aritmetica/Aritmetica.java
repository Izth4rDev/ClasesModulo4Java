package clase3.aritmetica;
import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        //Suma de valores
        int num1 = 2;
        int num2 = 4;
        int resultado = num1 + num2;
        System.out.println("el resultado de la suma es: " + resultado);

        //resta
        int num3 = 12;
        int num4 = 10;
        int resultado2 = num3 - num4;
        System.out.println("el resultado de la resta es: " + resultado2);

        //multiplicacion
        int num5 = 20;
        int num6 = 4;
        int resultado3 = num5 * num6;
        System.out.println("el resultado de la multiplicacion es: "+resultado3);

        //multiplicacion con decimales
        float num7 = 10.5f;
        float num8 = 2.8f;
        float resultado4 = num7 * num8;
        System.out.println("el resultado de la multiplicacion con decimales es: "+resultado4);

        //division
        int num9 = 10;
        int num10 = 5;
        int resultado5 = num9 / num10;
        System.out.println("El resultado de la division es: "+ resultado5);

        //division
        /*int num11 = 10;
        int resultado6 = num11 / 0; // <- No se puede dividir por 0
        System.out.println("El Resultado es :" + resultado6);*/

        //division con decimales
        double num11 = 25.3334;
        double num12 = 2.32675;
        double resultado6 = num11 / num12;
        System.out.println("el resultado de la division decimal es: "+resultado6);

        //modulo
        int num13 = 12;
        int num14 = 5;
        int resultado7 = num13 % num14;
        System.out.println("El resultado del modulo es: "+resultado7);


        ////////////Acumuladores o operadores de asignacion combinados//////////
        //Acumulador suma
        int num15 = 20;
        num15 = num15 + 12;
        num15+=12; //<-acumulador es equivalente a num15 = num15 + 12;
        System.out.println("el resultado de la operacion suma acumulada es: " + num15);

        //Acumulador resta
        int num16 = 20;
        num16 = num16 - 12;
        num16-=12;
        System.out.println("el resultado de la operacion resta acumulada es: " + num16);

        //Acumulador multiplicacion
        int num17 = 20;
        num17 = num17 * 2;
        num17*=2;
        System.out.println("el resultado de la operacion multiplicacion acumulada es: " + num17);

        //Acumulador division
        int num18 = 20;
        num18 = num18 / 2;
        num18/=2;
        System.out.println("el resultado de la operacion division acumulada es: "+num18);

        //acumulador modulo
        int num19 = 40;
        num19 = num19 % 3;
        num19%=3;
        System.out.println("el resultado del modulo acumulado es: " + num19);

        /////Operadores de incremento y decremento////
        //operador de incremento
        int num20 = 10;
        num20++;//num20 = num20 + 1; son equivalentes
        System.out.println("el resultado de incremento: " + num20);

        //operador de decremento
        int num21 = 10;
        num21--;//num21 = num21 - 1; son equivalentes
        System.out.println("el resultado de decremento es: " + num21);

        //Orden de precedencia
        // primero los parentesis -> luego las * / -> luego las + y - / se priorisa la operacion de izquierda a derecha
        int resultado8 = 4 + 5 - 2;
        int resultado9 = 2 * 5 + (4-3);
        System.out.println("el resultado de la operacion de precedencia es: " + resultado8);
        System.out.println("el resultado de la segunda operacion de precedencia es: " + resultado9);

    }
}
