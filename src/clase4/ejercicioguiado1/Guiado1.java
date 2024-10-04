package clase4.ejercicioguiado1;

import java.util.Scanner;

public class Guiado1 {
    public static void main(String[] args) {
        //Calcular el promedio ingresado por consola
        //mostrar todos los datos ingresados por consola

        //Definir variables y objetos que vamos a utilizar
        Scanner sc = new Scanner(System.in);
        String nombreAlumno, nombreDocente, asignatura;
        double nota1, nota2, nota3, promedio;

        //Obtener datos por la consola
        System.out.println("Ingrese el nombre del alumno: ");
        nombreAlumno = sc.nextLine();
        System.out.println("Ingrese el nombre del docente: ");
        nombreDocente = sc.nextLine();
        System.out.println("Ingrese la asignatura: ");
        asignatura = sc.nextLine();
        System.out.println("Ingrese la nota1: ");
        nota1 = sc.nextDouble();
        System.out.println("Ingrese la nota2: ");
        nota2 = sc.nextDouble();
        System.out.println("Ingrese la nota3: ");
        nota3 = sc.nextDouble();

        //Calcular el promedio
        promedio = (nota1 + nota2 + nota3)/3;

        //mostrar el promedio
        System.out.println("el promedio del alumno es: :" + promedio);

    }
}
