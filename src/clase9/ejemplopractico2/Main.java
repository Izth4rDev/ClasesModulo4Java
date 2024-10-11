package clase9.ejemplopractico2;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();

        perro1.setNombre("Pepita");
        perro1.setAltura(150);
        perro1.setPeso(150);
        perro1.setNivelDeEnergia(100);

        System.out.println("Nombre del perro: " + perro1.getNombre() + "Altura del perro: " + perro1.getAltura()
        +" Peso del perro: "+ perro1.getPeso() + "Nivel de energia del perro: "+ perro1.getNivelDeEnergia());

        perro1.caminar();
        perro1.comer();
        perro1.correr();
        perro1.ladrar();

    }
}
