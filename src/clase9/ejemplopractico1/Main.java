package clase9.ejemplopractico1;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedrito", "Pascal",40);

        /*System.out.println("El nombre del mandaloriano es: " +persona1.name);

        persona1.name = "Grogu";

        System.out.printf("El nombre del mandaloriano es: " + persona1.name);*/

        persona1.setName("Grogu");
        System.out.println("El nombre del mandaloriano es: " + persona1.getName());

        Persona persona2 = new Persona();
        persona2.setName("Vader");
        persona2.setLastName("Skywalker");
        persona2.setAge(22);

        //impresion por consola del objeto (los atributos del obejto)
        System.out.println(persona2);

    }
}
