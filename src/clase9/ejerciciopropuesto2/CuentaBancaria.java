package clase9.ejerciciopropuesto2;

public class CuentaBancaria {
    //atributos
    private String numeroCuenta;
    private double saldo;

    //contructor
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

     public CuentaBancaria() {}

    //getter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    //setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos propios
    public void depositar(double valor) {
        if(valor<=0){
            System.out.println("El valor no puede ser 0 o negativo");
        }else{
            this.saldo += valor;
            System.out.println("El nuevo saldo es" + this.saldo);
        }
    }

    public void retirar(double valor) {
        if(valor<=0){
            System.out.println("El valor no puede ser 0 o negativo");
        }else{
            if(this.saldo>=valor){
                this.saldo -= valor;
                System.out.println("su nuevo saldo es: "   + this.saldo);
            }else{
                System.out.println("Los fondos en su cuenta son insuficientes");
            }
        }
    }
}
