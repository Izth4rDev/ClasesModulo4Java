package clase9.ejemplopractico3;

public class Calculadora {

    public void sumar(int num1, int num2) {
        System.out.println("El resultado de la suma de 2 parametros es: " + (num1 + num2));
    }

    public void sumar(double num1, double num2) {
        System.out.println("El resultado de la suma de parametros con tipo de dato double es: " + (num1 + num2));
    }

    public void sumar(int num1, int num2, int num3) {
        System.out.println("el resultado de la suma de 3 parametros es: " + (num1 + num2 + num3));
    }

}
