package clase6.ejerciciopropuesto3;

public class CuentaRegresiva {
    public static void main(String[] args) {
        int i = 20;
        while (i >= 0) {
            System.out.println(i);
            i -= 1; // Equivalente a i = i - 2
            try {
                Thread.sleep(1000); // Pausa de un segundo
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
        }
    }
}
