package clase9.ejerciciopropuesto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        int opcion;

        System.out.println("Realice su primer deposito");
        double desposito = sc.nextDouble();
        cuentaBancaria.setSaldo(desposito);
        cuentaBancaria.setNumeroCuenta("4568921345678");

        do{
            System.out.println("Elige una opcion");
            System.out.println("1 - deposito");
            System.out.println("2 - retirar fondos");
            System.out.println("3 - salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese la cantidad del deposito");
                    int cantidad = sc.nextInt();
                    cuentaBancaria.depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese la cantida que desea retirar");
                    int cantidadRetirada = sc.nextInt();
                    cuentaBancaria.retirar(cantidadRetirada);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.....");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 3);
    }
}
