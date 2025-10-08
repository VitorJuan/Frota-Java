package atividades.frotas;

import java.util.Scanner;

public class Main {

	Scanner in = new Scanner(System.in);
	
	Frota frota = new Frota();
	
	//Opções para o menu
	private static final int ADICIONAR_VEICULO = 1;
	private static final int REMOVER_VEICULO = 2;
	private static final int LISTAR_VEICULO = 3;
	private static final int CALCULAR_PRECO_FROTA = 4;
	private static final int SAIR = 0;
	
	//Opções para veiculos
	private static final int ADICIONAR_CAMINHAO = 1;
	private static final int ADICIONAR_VAN = 2;
	
	public Main() {
		start();
	}
	
	public void printMenuOptions() {
		System.out.println("1 - Adicionar Veiculo\n" +
							"2 - Remover Veiculo\n" +
							"3 - Listar Veiculos\n" +
							"4 - Calcular custo total da frota");
	}
	
	public void handleVehicleOpions() {
		System.out.println("1 - Adicionar Caminhao\n" +
							"2 - Adicionar Van");
		int option = in.nextInt();
		
		switch (option) {
			case ADICIONAR_CAMINHAO:
				Caminhao caminhao = new Caminhao();
				
				in.nextLine();
				System.out.print("Informe a placa: ");
				caminhao.setPlaca(in.nextLine());
				
				System.out.print("Informe a Capacidade de Carga: ");
				caminhao.setCapacidadeCarga(in.nextDouble());
			
				System.out.print("Informe a distancia: ");
				caminhao.setDistancia(in.nextDouble());
				
				frota.adicionarNovoVeiculo(caminhao);
				System.out.println("Novo Caminhao adicionado com sucesso");
			break;
			
			case ADICIONAR_VAN:
				Van van = new Van();
				
				in.nextLine();
				System.out.print("Informe a placa: ");
				van.setPlaca(in.nextLine());
				
				System.out.print("Informe a distancia: ");
				van.setDistancia(in.nextDouble());
				
				frota.adicionarNovoVeiculo(van);
				System.out.println("Nova van adicionada com sucesso");
			break;
		}
	}
	
	public void removerVeiculo() {
		if (!frota.isListaVazia()) {
			System.out.print("Informe o index a ser removido: ");
			frota.removerVeiculo(in.nextInt());
		}
		else {
			System.out.println("Nao foi possivel remover o veiculo, a lista de veiculos esta vazia");
		}
	}
	
	public void listarFrota() {
		if (!frota.isListaVazia()) {
			frota.listarTodosVeiculos();
		}
		else {
			System.out.println("Nao foi possivel listar os veiculos, a lista esta vazia");
		}
	}
	
	public void calcularPrecoTotalFrota() {
		if (!frota.isListaVazia()) {
			System.out.println("Preço total da frota: " + frota.calcularCustoTotal());	
		}
		else {
			System.out.println("Nao foi possivel calcular o preço da frota, a lista de veiculos esta vazia");
		}
	}
	
	public void handleOptions(int option) {
		switch (option) {
			case ADICIONAR_VEICULO:
				handleVehicleOpions();
			break;
			
			case REMOVER_VEICULO:
				removerVeiculo();
			break;
			
			case LISTAR_VEICULO:
				listarFrota();
			break;
			
			case CALCULAR_PRECO_FROTA:
				calcularPrecoTotalFrota();
			break;
			
			case SAIR:
				System.out.println("Saindo...");
			break;
			
			default:
				System.out.println("Opção não encontrada, por favor tente novamente");
			break;
		}
	}
	
	public void start() {
		boolean exit = false;
		while (exit == false) {
			printMenuOptions();
			
			System.out.print("Por favor, digite uma opção: ");
			int input = in.nextInt();
			handleOptions(input);
		}
	}
	
	public static void main (String[] args) {
		new Main();
	} 

}
