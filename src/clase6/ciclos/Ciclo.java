package clase6.ciclos;

public class Ciclo {
    public static void main(String[] args) {
        /////////////FOR//////////////
       /* for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }*/

        ///////////WHILE//////////////
        int iter = 1;

        while(iter<=10){
            //codigo que se va a ejecutar dentro del ciclo
            System.out.println(iter);
            /////
            /////
            ////
            iter++; //variable de control aumentada
        }

        //sumatoria

        int sumatoria = 0;

        for(int i = 1; i<=100; i++){
            sumatoria += i;
        }

        System.out.println("la sumatoria es: "+sumatoria);

    }
}
