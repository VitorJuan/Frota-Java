package atividades.frotas;

public class Van extends Veiculo {
	
	@Override
	public double calcularCustoViagem(double distancia) {
		return (distancia* 2) + 50;
	}
	
}
