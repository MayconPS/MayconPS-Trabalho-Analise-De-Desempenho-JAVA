public class AppPrincipal {
    public static void main(String[] args) {
        int[] conjunto100 = GeradorAleatorio.criarNumeros(100);
        int[] conjunto1000 = GeradorAleatorio.criarNumeros(1000);
        int[] conjunto10000 = GeradorAleatorio.criarNumeros(10000);

        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("Testes com 100 elementos:");
        TestesArvore.testarInsercaoCrescente(arvore, conjunto100);
        TestesArvore.testarInsercaoDecrescente(arvore, conjunto100);
        TestesArvore.testarInsercaoAleatoria(arvore, conjunto100);
        TestesArvore.testarBusca(arvore);
        TestesArvore.testarBuscaAleatoria(arvore);

        System.out.println("\nTestes com 1000 elementos:");
        TestesArvore.testarInsercaoCrescente(arvore, conjunto1000);
        TestesArvore.testarInsercaoDecrescente(arvore, conjunto1000);
        TestesArvore.testarInsercaoAleatoria(arvore, conjunto1000);
        TestesArvore.testarBusca(arvore);
        TestesArvore.testarBuscaAleatoria(arvore);

        System.out.println("\nTestes com 10000 elementos:");
        TestesArvore.testarInsercaoCrescente(arvore, conjunto10000);
        TestesArvore.testarInsercaoDecrescente(arvore, conjunto10000);
        TestesArvore.testarInsercaoAleatoria(arvore, conjunto10000);
        TestesArvore.testarBusca(arvore);
        TestesArvore.testarBuscaAleatoria(arvore);
    }
}
