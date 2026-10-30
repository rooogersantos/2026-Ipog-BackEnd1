package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {
    public static void main(String[] args) {
        // Interface Lista para armazenar os dados
        List<Employee> list = new ArrayList<>();

        //Leitura
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos funcionários serão registrados? ");
        int quant = leitura.nextInt();
        System.out.println();
        System.out.println("Início dO Cadastro de " + quant + " Funcionários");
        System.out.println();

        for (int i = 0; i < quant; i++) {
            System.out.println("Funcionário nº" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = leitura.nextInt();
            System.out.print("Nome: ");
            leitura.nextLine(); // Limpando o buffer de leitura
            String name = leitura.nextLine();
            System.out.print("Salário: ");
            Double salary = leitura.nextDouble();
            
            // Instanciar objeto do tipo Employee
            Employee funcionario = new Employee(id, name, salary);
            list.add(funcionario); // Adiciona no fim da lista
            System.out.println();
        }

        //Leitura de aumento de salário
        System.out.print("Digite o ID do funcionário que terá aumento de salário: ");
        int idAlvo = leitura.nextInt();
        System.out.println();

        System.out.print("Digite a porcentagem de aumento: ");
        Double aumento = leitura.nextDouble();
        System.out.println();
    }
}
