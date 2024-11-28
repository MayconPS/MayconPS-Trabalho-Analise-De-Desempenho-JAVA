public class OperacoesInsercaoAVL {

    // Inserir valores ordenados
    public static void inserirEmOrdem(ArvoreAVL arvore, int[] valores) {
        try {
            long inicio = System.nanoTime();
            for (int valor : valores) {
                arvore.adicionar(valor);
            }
            long fim = System.nanoTime();
            System.out.println("Inserção ordenada concluída em: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção ordenada: " + e.getMessage());
        }
    }

    // Inserir valores em ordem inversa
    public static void inserirEmOrdemInversa(ArvoreAVL arvore, int[] valores) {
        try {
            long inicio = System.nanoTime();
            for (int i = valores.length - 1; i >= 0; i--) {
                arvore.adicionar(valores[i]);
            }
            long fim = System.nanoTime();
            System.out.println("Inserção inversa concluída em: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção inversa: " + e.getMessage());
        }
    }

    // Inserir valores aleatórios
    public static void inserirValoresAleatorios(ArvoreAVL arvore, int[] valores) {
        try {
            long inicio = System.nanoTime();
            for (int valor : valores) {
                arvore.adicionar(valor);
            }
            long fim = System.nanoTime();
            System.out.println("Inserção aleatória concluída em: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro durante a inserção aleatória: " + e.getMessage());
        }
    }
}
