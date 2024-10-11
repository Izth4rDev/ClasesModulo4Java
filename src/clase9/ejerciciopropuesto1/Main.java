package clase9.ejerciciopropuesto1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = sc.nextInt();

        //instanciamos un objeto de la clase Calculadora
        Calculadora calculadora = new Calculadora(num1, num2);

        //Invocar a los metodos de la calculadora
        calculadora.sum();
        calculadora.subtract();
        calculadora.multiply();
        calculadora.divide();

    }
}
