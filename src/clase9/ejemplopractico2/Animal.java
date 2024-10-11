package clase9.ejemplopractico2;

public class Animal {
    protected String nombre;
    protected int peso;
    protected double altura;

    //constructor
    public Animal(String nombre, int peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public Animal(){
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos de la clase padre
    public void comer(){
        System.out.println( "Esta comiendo");
    }
    public void caminar(){
        System.out.println( "Esta caminando");
    }
    public void correr(){
        System.out.println("Esta corriendo");
    }

}
