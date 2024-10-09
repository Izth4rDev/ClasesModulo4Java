package clase7.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciNumbers = 20;
        int a = 0, b = 1;
        int contador = 0;

        while(contador<fibonacciNumbers){
            System.out.println(a);
            int aux = a + b;
            a = b;
            b = aux;
            contador++;
        }
    }
}
