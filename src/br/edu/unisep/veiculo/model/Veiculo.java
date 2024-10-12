package br.edu.unisep.veiculo.model;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected String cor;
    protected int ano;
    protected String marca;

    public Veiculo(String placa, String modelo, String cor, int ano, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
    }
    public void exibirDetalhes () {
        System.out.println("Placa: " + placa
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno: " + ano
                + "\nMarca" + marca);
    }
}
