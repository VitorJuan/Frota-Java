package atividades.frotas;

import java.util.ArrayList;

public class Frota {

	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public void adicionarNovoVeiculo(Veiculo novoVeiculo) {
		getVeiculos().add(novoVeiculo);
	}
	
	public void removerVeiculo(int index) {
		getVeiculos().remove(index);
	}
	
	public boolean isListaVazia() {
		if (veiculos.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void listarTodosVeiculos() {
		for (int x = 0; x < getVeiculos().size(); x++) {
			System.out.println("ID: " + x + " " + getVeiculos().get(x).toString());
		}
	}
	
	public double calcularCustoTotal() {
		double custoTotal = 0;
		for (int x = 0; x < getVeiculos().size(); x++) {
			custoTotal = custoTotal + getVeiculos().get(x).calcularCustoViagem(getVeiculos().get(x).getDistancia());
		}
		return custoTotal;
	}
	
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	
}
