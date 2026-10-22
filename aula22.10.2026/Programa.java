package app;

import java.util.Scanner;

import model.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		// Lendo os dados do primeiro Funcionário
		// Instânciar um objeto da classe "Funcionario"
		Funcionario funcionario1 = new Funcionario();
		System.out.println("Informe os dados do primeiro Funcioário");
		System.out.print("Nome: ");
		funcionario1.nome = leitura.nextLine(); 
		System.out.print("Valor por hora: ");
		funcionario1.valorPorHora = leitura.nextDouble(); 
		System.out.print("Horas Trabalhadas: ");
		funcionario1.horasTrabalhadas = leitura.nextInt(); 
		
		// Limpeza de buffer da scanner do teclado, 
		// erro que depois de um leitura de numero fica dados no buffer
		leitura.nextLine(); 
		
		// Lendo os dados do segundo Funcionário
		// Instânciar um objeto da classe "Funcionario"
		Funcionario funcionario2 = new Funcionario();
		System.out.println("Informe os dados do segundo Funcioário");
		System.out.print("Nome: ");
		funcionario2.nome = leitura.nextLine(); 
		System.out.print("Valor por hora: ");
		funcionario2.valorPorHora = leitura.nextDouble(); 
		System.out.print("Horas Trabalhadas: ");
		funcionario2.horasTrabalhadas = leitura.nextInt(); 
		
		
		// Calcular e exibir o valor total pago aos funcionários
		Double totalPago = funcionario1.calculaSalario() + funcionario2.calculaSalario();
		System.out.println("\nValor total pago aos funcionário: R$ " + totalPago);
		
		// Exibir as horas trabalhas por funcionário
		System.out.println("\nHoras trabalhadas por funcionário:");
		System.out.println(funcionario1.nome + ": " + funcionario1.horasTrabalhadas + " horas");
		System.out.println(funcionario2.nome + ": " + funcionario2.horasTrabalhadas + " horas");
		
		leitura.close();

	}

} {
    
}
