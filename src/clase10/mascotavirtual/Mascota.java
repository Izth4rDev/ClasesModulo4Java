package clase10.mascotavirtual;

public class Mascota {
    //Atributos
    private String nombre;
    private int hambre;
    private int felicidad;
    private int energia;

    //contructor
    public Mascota(String nombre) {
        this.nombre = nombre;
        this.hambre = 50;
        this.felicidad = 50;
        this.energia = 50;
    }

    public Mascota() {}

    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getEnergia() {
        return energia;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //Metodos de la mascota
    public void alimentar() {
        if(hambre>=100){
            System.out.println("Tu mascota esta pochita no puede comer mas");
        }else{
            hambre += 10;
            felicidad += 5;
            energia += 5;
            System.out.println("has alimentado a tu mascota" + nombre);
        }
    }

    public void jugar(){
        if(energia<=0){
            System.out.println("Tu mascota esta demasiado cansada para jugar");
        }else{
            felicidad +=10;
            energia -= 15;
            System.out.println("Has jugado con " + nombre);
        }
    }

    public void dormir(){
        energia += 20;
        hambre -= 10;
        System.out.println(nombre + "Esta durmiendo y recuperado energia Zzzz....");
    }

    public void estado(){
        System.out.println("Estado de " + nombre + ": ");
        System.out.println("Hambre: " + hambre);
        System.out.println("Felicidad: " + felicidad);
        System.out.println("Energia: " + energia);
    }

    public boolean estaVivo(){
        return hambre>0 && felicidad>0 && energia>0;
    }

    //metodo
    @Override
    public String toString() {
        return "JuegoMascota{" +
                "nombre='" + nombre + '\'' +
                ", hambre=" + hambre +
                ", felicidad=" + felicidad +
                ", energia=" + energia +
                '}';
    }
}
