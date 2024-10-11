package clase9.ejemplopractico2;

public class Gato extends Animal {
    private int nivelDeEscalada;

    public Gato(String nombre, int peso, double altura, int nivelDeEscalada) {
        super(nombre, peso, altura);
        this.nivelDeEscalada = nivelDeEscalada;
    }

    public Gato(){
        super();
    }

    public int getNivelDeEscalada() {
        return nivelDeEscalada;
    }

    public void setNivelDeEscalada(int nivelDeEscalada) {
        this.nivelDeEscalada = nivelDeEscalada;
    }

    //Metodo propio del gato
    public void maullar(){
        System.out.println("Maullando");
    }
}
