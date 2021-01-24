import builder.Produto;
import builder.ProdutoBuilder;

public class Principal {
    public static void main(String[] args) {
     Produto produto = new ProdutoBuilder()
        .id(1)
        .titulo("Notebook HP 246 G7")
        .marca("Hewlett Packard")
        .createProduto();

        System.out.println(produto);
    }
}
