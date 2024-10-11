package clase9.ejerciciopropuesto1;

public class Calculadora {
    //atributos
    int number1;
    int number2;

    //constructor
    public Calculadora(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    //metodos
    public void sum(){
        int result = number1 + number2;
        System.out.println("El resultado de la suma es: "+result);
    }

    public void subtract(){
        int result = number1 - number2;
        System.out.println("El resultado de la resta es:"+result);
    }

    public void multiply(){
        int result = number1 * number2;
        System.out.println("El resultado de la multiplicacion es: "+result);
    }

    public void divide(){
        int result = number1 / number2;
        System.out.println("El resultado de la division es: "+result);
    }
}
