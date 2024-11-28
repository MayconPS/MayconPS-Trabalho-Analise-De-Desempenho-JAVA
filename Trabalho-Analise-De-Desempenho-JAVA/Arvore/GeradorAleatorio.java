import java.util.Random;

public class GeradorAleatorio {
    public static int[] criarNumeros(int quantidade) {
        int[] valores = new int[quantidade];
        Random aleatorio = new Random();
        for (int i = 0; i < quantidade; i++) {
            valores[i] = aleatorio.nextInt(10000); // Gera números de 0 a 9999
        }
        return valores;
    }
}
