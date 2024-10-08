package clase6.ejercicioguiado1;

public class EncontrarVocal {
    public static void main(String[] args) {
        String cadena = "Programacion en java es dificil";
        char vocalAEncontrar = 'i';
        int contador = 0;
        int nroDeVeces = 0;

        for(int i = 0; i < cadena.length(); i++){
            if(vocalAEncontrar == cadena.charAt(i)){
                contador++;
            }
            nroDeVeces++;
        }

        System.out.println("La vocal " + vocalAEncontrar + " se encuentra  este nro de veces " + contador);
        System.out.println("Nro de veces que se ejecuto el ciclo: " + nroDeVeces);
    }
}
