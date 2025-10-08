package atividades.frotas;

public abstract class Veiculo {
	private String placa;
	private double CapacidadeCarga;
	private double distancia;
	
	public abstract double calcularCustoViagem(double distancia);
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getCapacidadeCarga() {
		return this.CapacidadeCarga;
	}
	
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.CapacidadeCarga = capacidadeCarga;
	}
	

	public void setDistancia(double distancia) {
		this.distancia  = distancia;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
	public String toString() {
		return "Placa: " + getPlaca() + "; Capacidade Carga: " + getCapacidadeCarga() + "; Distancia: " + getDistancia();
	}
}
