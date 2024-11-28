public class AplicacaoPrincipal {
    public static void main(String[] args) {
        // Gerar dados de teste
        int[] conjunto100 = CriadorNumerosAleatorios.gerar(100);
        int[] conjunto1000 = CriadorNumerosAleatorios.gerar(1000);
        int[] conjunto10000 = CriadorNumerosAleatorios.gerar(10000);

        // Instanciar a árvore AVL
        ArvoreAVL minhaArvoreAVL = new ArvoreAVL();

        // Inserções
        OperacoesInsercaoAVL.inserirEmOrdem(minhaArvoreAVL, conjunto100);
        OperacoesInsercaoAVL.inserirEmOrdem(minhaArvoreAVL, conjunto1000);
        OperacoesInsercaoAVL.inserirEmOrdem(minhaArvoreAVL, conjunto10000);

        OperacoesInsercaoAVL.inserirEmOrdemInversa(minhaArvoreAVL, conjunto100);
        OperacoesInsercaoAVL.inserirEmOrdemInversa(minhaArvoreAVL, conjunto1000);
        OperacoesInsercaoAVL.inserirEmOrdemInversa(minhaArvoreAVL, conjunto10000);

        OperacoesInsercaoAVL.inserirValoresAleatorios(minhaArvoreAVL, conjunto100);
        OperacoesInsercaoAVL.inserirValoresAleatorios(minhaArvoreAVL, conjunto1000);
        OperacoesInsercaoAVL.inserirValoresAleatorios(minhaArvoreAVL, conjunto10000);

        // Buscas
        OperacoesBuscaAVL.buscarPrimeiroElemento(minhaArvoreAVL, conjunto100[0]);
        OperacoesBuscaAVL.buscarPrimeiroElemento(minhaArvoreAVL, conjunto1000[0]);
        OperacoesBuscaAVL.buscarPrimeiroElemento(minhaArvoreAVL, conjunto10000[0]);

        OperacoesBuscaAVL.buscarUltimoElemento(minhaArvoreAVL, conjunto100[conjunto100.length - 1]);
        OperacoesBuscaAVL.buscarUltimoElemento(minhaArvoreAVL, conjunto1000[conjunto1000.length - 1]);
        OperacoesBuscaAVL.buscarUltimoElemento(minhaArvoreAVL, conjunto10000[conjunto10000.length - 1]);

        OperacoesBuscaAVL.buscarElementoDoMeio(minhaArvoreAVL, conjunto100[conjunto100.length / 2]);
        OperacoesBuscaAVL.buscarElementoDoMeio(minhaArvoreAVL, conjunto1000[conjunto1000.length / 2]);
        OperacoesBuscaAVL.buscarElementoDoMeio(minhaArvoreAVL, conjunto10000[conjunto10000.length / 2]);

        OperacoesBuscaAVL.buscarElementoAleatorio(minhaArvoreAVL, conjunto100);
        OperacoesBuscaAVL.buscarElementoAleatorio(minhaArvoreAVL, conjunto1000);
        OperacoesBuscaAVL.buscarElementoAleatorio(minhaArvoreAVL, conjunto10000);

        OperacoesBuscaAVL.buscarValorInexistente(minhaArvoreAVL);
    }
}
