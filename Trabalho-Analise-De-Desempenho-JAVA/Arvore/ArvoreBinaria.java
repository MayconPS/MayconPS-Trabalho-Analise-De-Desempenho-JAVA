import java.util.Random;

public class ArvoreBinaria {
    private Nodo raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adicionar(int valor) {
        raiz = inserirElemento(raiz, valor);
    }

    private Nodo inserirElemento(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.esquerdo = inserirElemento(nodo.esquerdo, valor);
        } else if (valor > nodo.valor) {
            nodo.direito = inserirElemento(nodo.direito, valor);
        }
        return nodo;
    }

    private int contarElementos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarElementos(nodo.esquerdo) + contarElementos(nodo.direito);
    }

    public int calcularTamanho() {
        return contarElementos(raiz);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void inserirCrescente(int valor) {
        raiz = inserirElemento(raiz, valor);
    }

    public void inserirDecrescente(int valor) {
        raiz = inserirElementoInvertido(raiz, valor);
    }

    private Nodo inserirElementoInvertido(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor > nodo.valor) {
            nodo.esquerdo = inserirElementoInvertido(nodo.esquerdo, valor);
        } else if (valor < nodo.valor) {
            nodo.direito = inserirElementoInvertido(nodo.direito, valor);
        }
        return nodo;
    }

    public void inserirAleatorio(int valor) {
        Random rand = new Random();
        raiz = inserirElementoAleatorio(raiz, valor, rand);
    }

    private Nodo inserirElementoAleatorio(Nodo nodo, int valor, Random rand) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (rand.nextBoolean()) {
            nodo.esquerdo = inserirElementoAleatorio(nodo.esquerdo, valor, rand);
        } else {
            nodo.direito = inserirElementoAleatorio(nodo.direito, valor, rand);
        }
        return nodo;
    }

    public int encontrarMenor() {
        Nodo atual = raiz;
        while (atual != null && atual.esquerdo != null) {
            atual = atual.esquerdo;
        }
        return (atual != null) ? atual.valor : -1;
    }

    public int encontrarMaior() {
        Nodo atual = raiz;
        while (atual != null && atual.direito != null) {
            atual = atual.direito;
        }
        return (atual != null) ? atual.valor : -1;
    }

    public int buscarPorIndiceAleatorio(int posicao) {
        int tamanho = contarElementos(raiz);
        if (posicao < 1 || posicao > tamanho) {
            return -1;
        }
        return buscarPorIndice(raiz, posicao).valor;
    }

    private Nodo buscarPorIndice(Nodo nodo, int posicao) {
        int tamanhoEsquerda = contarElementos(nodo.esquerdo);
        if (posicao <= tamanhoEsquerda) {
            return buscarPorIndice(nodo.esquerdo, posicao);
        } else if (posicao == tamanhoEsquerda + 1) {
            return nodo;
        } else {
            return buscarPorIndice(nodo.direito, posicao - tamanhoEsquerda - 1);
        }
    }
}

class Nodo {
    int valor;
    Nodo esquerdo, direito;

    public Nodo(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }
}
