public class Main {
    public static void main(String[] args) {
        // 1. Criando o produto
        Produto p1 = new Produto();
        
        p1.nome = "Smartphone";
        p1.preco = 1500.00;
        p1.quantidade = 10;
        
        // 2. Exibindo estado inicial
        System.out.println("--- ESTADO INICIAL ---");
        p1.exibirInformacoes(); 
        
        // 3. Atualizando preço e estoque
        System.out.println("...Atualizando preço e estoque...");
        p1.atualizarPreco(1350.00);
        p1.adicionarEstoque(5);
        
        // 4. Exibindo estado final
        System.out.println("\n--- ESTADO FINAL ---");
        p1.exibirInformacoes();
    }
}
