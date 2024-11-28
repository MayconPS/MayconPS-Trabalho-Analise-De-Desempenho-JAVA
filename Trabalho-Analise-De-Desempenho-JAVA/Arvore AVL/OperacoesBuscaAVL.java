import java.util.Random;

public class OperacoesBuscaAVL {
    public static void buscarPrimeiroElemento(ArvoreAVL arvore, int primeiroValor) {
        try {
            long inicio = System.nanoTime();
            arvore.contem(primeiroValor);
            long fim = System.nanoTime();
            System.out.println("Tempo para buscar o primeiro valor: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro ao buscar o primeiro valor: " + e.getMessage());
        }
    }

    public static void buscarUltimoElemento(ArvoreAVL arvore, int ultimoValor) {
        try {
            long inicio = System.nanoTime();
            arvore.contem(ultimoValor);
            long fim = System.nanoTime();
            System.out.println("Tempo para buscar o último valor: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro ao buscar o último valor: " + e.getMessage());
        }
    }

    public static void buscarElementoDoMeio(ArvoreAVL arvore, int valorCentral) {
        try {
            long inicio = System.nanoTime();
            arvore.contem(valorCentral);
            long fim = System.nanoTime();
            System.out.println("Tempo para buscar o valor central: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro ao buscar o valor central: " + e.getMessage());
        }
    }

    public static void buscarElementoAleatorio(ArvoreAVL arvore, int[] valores) {
        try {
            Random gerador = new Random();
            int indiceAleatorio = gerador.nextInt(valores.length);
            long inicio = System.nanoTime();
            arvore.contem(valores[indiceAleatorio]);
            long fim = System.nanoTime();
            System.out.println("Tempo para buscar um valor aleatório: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro ao buscar valor aleatório: " + e.getMessage());
        }
    }

    public static void buscarValorInexistente(ArvoreAVL arvore) {
        try {
            long inicio = System.nanoTime();
            arvore.contem(999999); // Valor não existente
            long fim = System.nanoTime();
            System.out.println("Tempo para buscar um valor inexistente: " + (fim - inicio) + " nanossegundos");
        } catch (Exception e) {
            System.out.println("Erro ao buscar valor inexistente: " + e.getMessage());
        }
    }
}
