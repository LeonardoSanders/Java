package NivelIntermediario.List.Aula02_Generics.Treino;

public class Main {
    public static void main(String[] args) {
        Carrinho_Compras<Produtos> superMercado = new Carrinho_Compras<>();
        superMercado.adicionarProduto(new Produtos("Arroz"));
        superMercado.adicionarProduto(new Produtos("Feijão"));
        superMercado.adicionarProduto(new Produtos("Sabão"));

        System.out.println(superMercado);
    }
}
