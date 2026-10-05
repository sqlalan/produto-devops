public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.preco = 89.90;
        produto.quantidade = 10;
        produto.mostrarDetalhes();

        System.out.println("--------------------");

        // Desafio adicional: segundo produto
        Produto produto2 = new Produto();
        produto2.nome = "Teclado";
        produto2.preco = 149.90;
        produto2.quantidade = 5;
        produto2.mostrarDetalhes();
    }
}
