package atividades.frotas;

public class Caminhao extends Veiculo{
	
	@Override
	public double calcularCustoViagem(double distancia) {
		return (distancia * (getCapacidadeCarga() / 1000));
	}
	
}
