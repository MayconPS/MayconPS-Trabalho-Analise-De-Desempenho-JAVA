import java.util.Random;

public class CriadorNumerosAleatorios {
    public static int[] gerar(int quantidade) {
        try {
            Random randomizador = new Random();
            int[] numeros = new int[quantidade];
            for (int i = 0; i < quantidade; i++) {
                numeros[i] = randomizador.nextInt();
            }
            return numeros;
        } catch (Exception e) {
            System.out.println("Erro ao criar números aleatórios: " + e.getMessage());
            return new int[0];
        }
    }
}
