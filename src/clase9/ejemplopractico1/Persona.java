package clase9.ejemplopractico1;

public class Persona {
    //atributos
    private String name;
    private String lastName;
    private int age;

    //contructor
    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Persona(){}

    //Setter
    public void setName(String name) {  //el nombre del metodo tiene que ser por estandar set{nombreAtributo}
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getter
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
