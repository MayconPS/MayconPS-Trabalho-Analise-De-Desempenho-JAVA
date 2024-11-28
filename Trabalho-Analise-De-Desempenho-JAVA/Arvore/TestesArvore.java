import java.util.Random;

public class TestesArvore {

    public static void testarInsercaoCrescente(ArvoreBinaria arvore, int[] numeros) {
        long inicio = System.nanoTime();
        for (int valor : numeros) {
            arvore.inserirCrescente(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Inserção crescente: " + (fim - inicio) + " ns (" + numeros.length + " elementos)");
    }

    public static void testarInsercaoDecrescente(ArvoreBinaria arvore, int[] numeros) {
        long inicio = System.nanoTime();
        for (int valor : numeros) {
            arvore.inserirDecrescente(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Inserção decrescente: " + (fim - inicio) + " ns (" + numeros.length + " elementos)");
    }

    public static void testarInsercaoAleatoria(ArvoreBinaria arvore, int[] numeros) {
        long inicio = System.nanoTime();
        for (int valor : numeros) {
            arvore.inserirAleatorio(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Inserção aleatória: " + (fim - inicio) + " ns (" + numeros.length + " elementos)");
    }

    public static void testarBusca(ArvoreBinaria arvore) {
        System.out.println("Menor elemento: " + arvore.encontrarMenor());
        System.out.println("Maior elemento: " + arvore.encontrarMaior());
    }

    public static void testarBuscaAleatoria(ArvoreBinaria arvore) {
        Random aleatorio = new Random();
        int tamanho = arvore.calcularTamanho(); // Use o método público
        if (tamanho > 0) {
            int indice = aleatorio.nextInt(tamanho) + 1;
            long inicio = System.nanoTime();
            int valor = arvore.buscarPorIndiceAleatorio(indice);
            long fim = System.nanoTime();
            System.out.println("Busca aleatória (índice " + indice + "): " + valor + " em " + (fim - inicio) + " ns");
        }
    }
    
}
