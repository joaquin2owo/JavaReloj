
package RELOJ;


public class RelojTiempo{
    public static void main(String[] args) {
        
        int min=0;
        while (min <= 95) {
            System.out.println("Minutos: " + min);

            int n = 1; // Reiniciamos n en 1 en cada iteración del bucle principal

            while (n <= 9) {
                if (min == 7 * n) {
                    System.out.println("_ _ _");
                    Prendas.PrendaRandom();
                    System.out.println("¯ ¯ ¯");
                }
                n++;
            }

            try {
                Thread.sleep(1000); // Espera un segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            min++; // Aumentamos min en cada iteración del bucle principal
            
            if(min>95){System.out.println("Tiempo terminado!");}
            }
        }    
        }