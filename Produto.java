public class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("--------------------------------");
    }

    void atualizarPreco(double novoPreco) {
        preco = novoPreco;
    }

    void adicionarEstoque(int quantidadeAdicional) {
        quantidade += quantidadeAdicional;
    }
}
