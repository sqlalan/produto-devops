public class Produto {

    String nome;
    double preco;
    int quantidade;

    public void mostrarDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.printf(java.util.Locale.US, "Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
