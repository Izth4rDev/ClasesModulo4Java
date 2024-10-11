package clase9.ejemplopractico2;

public class Perro extends Animal {
    private int nivelDeEnergia;

    //constructor
    public Perro(String nombre, int peso, double altura, int nivelDeEnergia) {
        super(nombre, peso, altura);
        this.nivelDeEnergia = nivelDeEnergia;
    }

    public Perro(){
        super();
    }

    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }

    public void setNivelDeEnergia(int nivelDeEnergia) {
        this.nivelDeEnergia = nivelDeEnergia;
    }

    //metodo propio del perro
    public void ladrar(){
        System.out.println("Perro Ladrado");
    }
}
