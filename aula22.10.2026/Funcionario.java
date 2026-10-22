package model;

public class Funcionario {
	// Atributos
	public String nome;
	public double valorPorHora;
	public int horasTrabalhadas;

	// Métodos
	public double calculaSalario() {
		return valorPorHora * horasTrabalhadas;
	}
}