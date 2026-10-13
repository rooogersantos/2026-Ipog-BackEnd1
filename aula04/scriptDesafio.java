import java.util.Scanner;

public class scriptDesafio {
    public static void main(String[] args) {
        // Leitura de dados
        String nome = lerNomeFuncionario();

        int projetosEntregues = leituraProjetosEntregues();
        int avaliacaoChefe = leituraAvaliacaoChefe();

        int pontuacao = calcularPontuacao(projetosEntregues, avaliacaoChefe );
        System.out.println("Pontuação final para o funcionário " + nome + ": " + pontuacao + " pontos.");
        if (pontuacao == 100) {
            System.out.println("Parabéns! Seu desempenho foi excelente!");
        } else if (pontuacao == 50) {
            System.out.println("Bom trabalho! Seu desempenho foi satisfatório.");
        } else {
            System.out.println("Seu desempenho precisa melhorar.");
        }
    }

    private static int leituraProjetosEntregues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de projetos entregues: ");
        int projetosEntregues = scanner.nextInt();
        return projetosEntregues;
    }

    private static int leituraAvaliacaoChefe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a avaliação do chefe (de 1 a 5): ");
        int avaliacaoChefe = scanner.nextInt();
        return avaliacaoChefe;
    }

    private static int calcularPontuacao(int projetosEntregues, int avaliacaoChefe) {
        if (projetosEntregues >= 5 && avaliacaoChefe >= 4) {
            return 100;
        } else if (projetosEntregues >= 3 &&  avaliacaoChefe >= 3) {
            return 80;
        } else {
            return 50;
        }  
    }
    
    private static String lerNomeFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        return nome;
    }
}
