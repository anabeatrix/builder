package builder;

import java.time.LocalDate;

public class Produto {
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

    @Override
    public String toString() {
        return "Produto {" +
                "id =" + id +
                ", titulo ='" + titulo + '\'' +
                ", marca ='" + marca + '\'' +
                '}';
    }

    Produto(int id, String titulo, String descricao, String marca, String modelo, int estoque,
            double preco, LocalDate dataCastro, LocalDate dataUltimaCadastro, String categoria,
            Vendedor vendedor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCastro = dataCastro;
        this.dataUltimaCadastro = dataUltimaCadastro;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCastro() {
        return dataCastro;
    }

    public void setDataCastro(LocalDate dataCastro) {
        this.dataCastro = dataCastro;
    }

    public LocalDate getDataUltimaCadastro() {
        return dataUltimaCadastro;
    }

    public void setDataUltimaCadastro(LocalDate dataUltimaCadastro) {
        this.dataUltimaCadastro = dataUltimaCadastro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
