package RELOJ;


public class Prendas{
    private static String[] prendas = {"Retroceder dos casilleros", "Volver al inicio","Retroceder cinco casilleros","Ceder turno","Ceder dos turnos"};
    public static void PrendaRandom(){
        double randomDouble = Math.random();  // Genera un número decimal aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        int indiceAleatorio = (int) (randomDouble * prendas.length);  // Multiplica por la longitud y redondea a un entero
        String prendaSeleccionada = prendas[indiceAleatorio];
        System.out.println(prendas[indiceAleatorio]);
    }
}

