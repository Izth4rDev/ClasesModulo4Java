package clase8.ejemplopractico4;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Miguel", "Rondanelli", 35);
        //invocacion metodo sin retorno
        person1.run();
        //invocacion metodo con retorno
        String messageRecieved = person1.sendMessage("Pedrito");
        System.out.println(messageRecieved);
        //invocacion metodo static
        Person.saludar();
    }
}
