package NivelIntermediario.List.Aula02_Generics.Treino;

import java.util.ArrayList;
import java.util.List;

public class Carrinho_Compras<T> {

    private List<T> carrinhoCompras;

    public Carrinho_Compras () {
        carrinhoCompras = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        carrinhoCompras.add(produto);
    }

    public List<T> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(List<T> carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    @Override
    public String toString() {
        return "Carrinho de Compras: " + carrinhoCompras.toString();
    }
}
