package builder;

import java.time.LocalDate;

public class ProdutoBuilder {
    private int id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCastro;
    private LocalDate dataUltimaCadastro;
    private String categoria;
    private Vendedor vendedor;

    public ProdutoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder dataCastro(LocalDate dataCastro) {
        this.dataCastro = dataCastro;
        return this;
    }

    public ProdutoBuilder dataUltimaCadastro(LocalDate dataUltimaCadastro) {
        this.dataUltimaCadastro = dataUltimaCadastro;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, titulo, descricao, marca, modelo, estoque, preco, dataCastro, dataUltimaCadastro, categoria, vendedor);
    }
}