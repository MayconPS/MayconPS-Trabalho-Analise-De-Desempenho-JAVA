# Projeto de Arvore Binária

Este projeto implementa uma árvore binária com testes de inserção e busca utilizando diferentes estratégias (crescente, decrescente, aleatória) para um conjunto de números gerados aleatoriamente. Os testes medem o tempo de execução para diferentes quantidades de elementos, variando entre 100, 1000 e 10000 elementos.

## Estrutura do Projeto

Abaixo está a descrição dos principais arquivos e suas responsabilidades:

### 1. `AppPrincipal.java`
- Arquivo principal do programa que realiza a execução dos testes de inserção e busca utilizando a árvore binária.
- Gera três conjuntos de números aleatórios de diferentes tamanhos (100, 1000 e 10000) e executa os testes para cada conjunto.

### 2. `ArvoreBinaria.java`
- Implementa a estrutura da árvore binária.
- Possui métodos para inserir elementos de forma crescente, decrescente ou aleatória.
- Métodos de busca como `encontrarMenor()`, `encontrarMaior()` e `buscarPorIndiceAleatorio()` são usados para testar a árvore.

### 3. `GeradorAleatorio.java`
- Responsável pela criação de um conjunto de números aleatórios.
- O método `criarNumeros(int quantidade)` gera um array de números inteiros aleatórios dentro de um intervalo predefinido.

### 4. `TestesArvore.java`
- Contém os métodos de teste para a árvore binária.
- Realiza testes de inserção e busca com diferentes estratégias e tempos de execução.

### 5. `Nodo.java`
- Representa um nó da árvore binária, contendo um valor e referências para os filhos esquerdo e direito.

### 6. `No.java`
- Definição de uma classe redundante, possivelmente usada em uma versão anterior do código, mas não utilizada no código atual.

## Dependências

Este projeto não possui dependências externas. Para compilar e executar, você precisa apenas de uma instalação do JDK (Java Development Kit).

## Instruções de Compilação e Execução

1. Certifique-se de ter o Java instalado. Você pode verificar com o comando:

    ```bash
    java -version
    ```

    Caso não tenha o JDK, faça o download em: [Java Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. Compile os arquivos Java utilizando o comando:

    ```bash
    javac *.java
    ```

3. Para executar o programa, utilize o comando:

    ```bash
    java AppPrincipal
    ```

4. O programa exibirá os resultados dos testes de inserção e busca na árvore binária para os conjuntos de 100, 1000 e 10000 elementos.

## Exemplos de Saída

Ao rodar o programa, você verá algo como:

Testes com 100 elementos: Inserção crescente: 500000 ns (100 elementos) Inserção decrescente: 520000 ns (100 elementos) Inserção aleatória: 510000 ns (100 elementos) Menor elemento: 1 Maior elemento: 9999 Busca aleatória (índice 5): 2500 em 230000 ns

Testes com 1000 elementos: Inserção crescente: 4000000 ns (1000 elementos) Inserção decrescente: 4500000 ns (1000 elementos) Inserção aleatória: 4200000 ns (1000 elementos) Menor elemento: 1 Maior elemento: 9999 Busca aleatória (índice 10): 1234 em 1000000 ns

# Projeto de Árvore AVL

Este projeto implementa uma árvore AVL (uma variação balanceada de árvore binária de busca) com testes de inserção e busca utilizando diferentes estratégias (ordenada, inversa e aleatória) para um conjunto de números gerados aleatoriamente. O programa também mede o tempo de execução para diferentes operações de busca e inserção.

## Estrutura do Projeto

Abaixo está a descrição dos principais arquivos e suas responsabilidades:

### 1. `AplicacaoPrincipal.java`
- Arquivo principal do programa que executa os testes de inserção e busca.
- Gera três conjuntos de números aleatórios (100, 1000 e 10000 elementos).
- Realiza inserções utilizando três estratégias diferentes: ordenada, inversa e aleatória.
- Realiza buscas para o primeiro, último, elemento do meio, elemento aleatório e um valor inexistente.

### 2. `ArvoreAVL.java`
- Implementa a estrutura da árvore AVL.
- Possui métodos para inserir elementos de forma ordenada, inversa ou aleatória.
- Inclui a lógica de balanceamento da árvore através de rotações (simples e duplas) durante a inserção.

### 3. `CriadorNumerosAleatorios.java`
- Responsável pela criação de números aleatórios.
- O método `gerar(int quantidade)` gera um array de números inteiros aleatórios.

### 4. `OperacoesBuscaAVL.java`
- Contém os métodos de teste para a busca na árvore AVL.
- Realiza buscas para o primeiro, último, elemento do meio, elemento aleatório e valor inexistente.

### 5. `OperacoesInsercaoAVL.java`
- Contém os métodos para inserir elementos na árvore AVL.
- Implementa três estratégias de inserção: em ordem crescente, inversa e aleatória.

### 6. `NoAVL.java`
- Representa um nó da árvore AVL, contendo um valor e referências para os filhos esquerdo e direito.
- Além disso, mantém a altura do nó, que é usada para o balanceamento da árvore.

## Dependências

Este projeto não possui dependências externas. Para compilar e executar, você precisa apenas de uma instalação do JDK (Java Development Kit).

## Instruções de Compilação e Execução

1. Certifique-se de ter o Java instalado. Você pode verificar com o comando:

    ```bash
    java -version
    ```

    Caso não tenha o JDK, faça o download em: [Java Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. Compile os arquivos Java utilizando o comando:

    ```bash
    javac *.java
    ```

3. Para executar o programa, utilize o comando:

    ```bash
    java AplicacaoPrincipal
    ```

4. O programa exibirá os resultados dos testes de inserção e busca na árvore AVL para os conjuntos de 100, 1000 e 10000 elementos.

## Exemplos de Saída

Ao rodar o programa, você verá algo como:

Inserção ordenada concluída em: 5000000 nanossegundos Inserção inversa concluída em: 5200000 nanossegundos Inserção aleatória concluída em: 5100000 nanossegundos

Tempo para buscar o primeiro valor: 230000 nanossegundos Tempo para buscar o último valor: 220000 nanossegundos Tempo para buscar o valor central: 240000 nanossegundos Tempo para buscar um valor aleatório: 250000 nanossegundos Tempo para buscar um valor inexistente: 180000 nanossegundos

# Medição de Tempo de Operações com Arrays

Este projeto foi desenvolvido para medir o tempo de execução de várias operações com arrays, como geração, busca e ordenação. O código realiza as medições de tempo utilizando a classe `System.nanoTime()`, oferecendo uma maneira de comparar o desempenho de diferentes algoritmos.

## Funcionalidades

O programa permite ao usuário medir o tempo das seguintes operações:

### 1. Geração e Busca em Array Ordenado
- Geração de array ordenado.
- Busca sequencial e binária no array ordenado.

### 2. Geração e Busca em Array Inversamente Ordenado
- Geração de array inversamente ordenado.
- Busca sequencial no array inversamente ordenado (não aplicável para busca binária, pois o array não está ordenado).

### 3. Geração e Busca em Array Aleatório
- Geração de array com elementos aleatórios.
- Busca sequencial no array aleatório (busca binária não aplicável, pois o array não está ordenado).

### 4. Medição do Tempo de Ordenação
- Ordenação de arrays com os algoritmos **Bubble Sort** e **Merge Sort**.

## Requisitos

- Java 8 ou superior
- Ambiente de desenvolvimento integrado (IDE) como Eclipse, IntelliJ IDEA ou similar.

## Classes e Funcionalidades

### 1. Main
A classe `Main` inicia o programa e chama a função `iniciar()` da classe `Menu`.

### 2. Menu
A classe `Menu` exibe um menu interativo, permitindo ao usuário escolher as operações que deseja medir.

### 3. MedidorDeTempo
A classe `MedidorDeTempo` é responsável por medir o tempo de execução das operações e exibir os resultados. As operações incluem:
- Geração de arrays (ordenados, inversos, aleatórios).
- Busca sequencial e binária (para arrays ordenados).
- Ordenação de arrays (Bubble Sort e Merge Sort).

### 4. Vetor
A classe `Vetor` contém métodos para gerar arrays, realizar buscas e ordenações, incluindo:
- Geração de arrays ordenados, inversos e aleatórios.
- Implementação dos algoritmos de busca sequencial e binária.
- Implementação dos algoritmos de ordenação Bubble Sort e Merge Sort.

## Como Executar

1. **Baixe o código** ou clone o repositório para o seu ambiente de desenvolvimento.

2. **Compile o código**:
   - Se estiver utilizando um IDE, basta abrir o projeto e compilar.
   - Se estiver utilizando o terminal, navegue até o diretório onde os arquivos estão localizados e execute o comando:
   
     ```bash
     javac Main.java MedidorDeTempo.java Menu.java Vetor.java
     ```

3. **Execute o programa**:
   - No terminal, execute o comando:

     ```bash
     java Main
     ```

4. **Interaja com o Menu**:
   - O programa exibirá um menu com várias opções.
   - Digite a opção desejada e siga as instruções para fornecer o tamanho do array e o valor a ser buscado.

## Exemplo de Execução

Ao executar o programa, o menu será exibido:

Escolha uma opção:

1.Medir tempo de inserção e busca em Array Ordenado
2.Medir tempo de inserção e busca em Array Inversamente Ordenado
3.Medir tempo de inserção e busca em Array Aleatório
4.Medir tempo de ordenação com Bubble Sort
5.Medir tempo de ordenação com Merge Sort
6.Encerrar programa

Digite o tamanho do array (100, 1000, 10000): 100 Digite o valor a ser buscado: 50 Tempo para gerar array em ordem: 23456 nanossegundos Valor 50 encontrado na posição 49. Tempo para busca sequencial no ordenado: 1234 nanossegundos Valor 50 encontrado na posição 49. Tempo para busca binária no ordenado: 567 nanossegundos