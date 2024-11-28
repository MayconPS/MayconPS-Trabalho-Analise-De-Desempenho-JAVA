public class ArvoreAVL {
    private NoAVL raiz;

    public ArvoreAVL() {
        raiz = null;
    }

    public void adicionar(int chave) {
        try {
            raiz = adicionarRecursivo(raiz, chave);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar à Árvore AVL: " + e.getMessage());
        }
    }

    private NoAVL adicionarRecursivo(NoAVL no, int chave) {
        if (no == null) {
            return new NoAVL(chave);
        }

        try {
            if (chave < no.chave) {
                no.esquerda = adicionarRecursivo(no.esquerda, chave);
            } else if (chave > no.chave) {
                no.direita = adicionarRecursivo(no.direita, chave);
            } else {
                return no; // Chave duplicada não é adicionada
            }

            no.altura = 1 + Math.max(calcularAltura(no.esquerda), calcularAltura(no.direita));
            int fatorBalanceamento = calcularBalanceamento(no);

            // Rotação à direita
            if (fatorBalanceamento > 1 && chave < no.esquerda.chave) {
                return rotacaoParaDireita(no);
            }

            // Rotação à esquerda
            if (fatorBalanceamento < -1 && chave > no.direita.chave) {
                return rotacaoParaEsquerda(no);
            }

            // Rotação dupla à direita
            if (fatorBalanceamento > 1 && chave > no.esquerda.chave) {
                no.esquerda = rotacaoParaEsquerda(no.esquerda);
                return rotacaoParaDireita(no);
            }

            // Rotação dupla à esquerda
            if (fatorBalanceamento < -1 && chave < no.direita.chave) {
                no.direita = rotacaoParaDireita(no.direita);
                return rotacaoParaEsquerda(no);
            }
        } catch (Exception e) {
            System.out.println("Erro durante o ajuste de balanceamento: " + e.getMessage());
        }

        return no;
    }

    private NoAVL rotacaoParaDireita(NoAVL y) {
        NoAVL x = y.esquerda;
        NoAVL z = x.direita;
        x.direita = y;
        y.esquerda = z;
        atualizarAltura(y);
        atualizarAltura(x);
        return x;
    }

    private NoAVL rotacaoParaEsquerda(NoAVL x) {
        NoAVL y = x.direita;
        NoAVL z = y.esquerda;
        y.esquerda = x;
        x.direita = z;
        atualizarAltura(x);
        atualizarAltura(y);
        return y;
    }

    private int calcularAltura(NoAVL no) {
        return no == null ? 0 : no.altura;
    }

    private int calcularBalanceamento(NoAVL no) {
        return no == null ? 0 : calcularAltura(no.esquerda) - calcularAltura(no.direita);
    }

    private void atualizarAltura(NoAVL no) {
        no.altura = 1 + Math.max(calcularAltura(no.esquerda), calcularAltura(no.direita));
    }

    public boolean contem(int valor) {
        return buscarRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(NoAVL no, int valor) {
        if (no == null) {
            return false;
        }
        if (valor == no.chave) {
            return true;
        }
        return valor < no.chave ? buscarRecursivamente(no.esquerda, valor) : buscarRecursivamente(no.direita, valor);
    }
}