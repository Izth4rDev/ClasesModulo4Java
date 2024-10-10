package clase8.ejemplopractico4;

public class Person {
    //atributos
    String name;
    String lastName;
    int age;

    //Constructor
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Metodos de instancia
    //No retornar valor
    public void run(){
        System.out.println(name + " Esta corriendo");
    }
    //retornan valor
    public String sendMessage(String userName){
       return "Hola user: "+ userName + " me llamo" + name;
    }

    //Metodos de tipo static o estatico
    public static void saludar(){
        System.out.println("Hola saludando");
    }


}
