package br.edu.unisep.veiculo.model;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota(int i) {
        veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    public void exibirDetalhesFrota() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }
}