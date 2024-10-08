package clase6.ejerciciopropuesto4;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15; // Cantidad de números de Fibonacci a mostrar
        int a = 0, b = 1;
        int contador = 0;

        System.out.println("Los primeros " + n + " números de la secuencia de Fibonacci son:");

        while (contador < n) {
            System.out.print(a + " ");
            //a contiene al anterior y b contiene al siguiente
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
    }
}
