import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = entrada.nextLine();

        System.out.print("Qual a sua nota? ");
        double nota = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Qual o seu curso? ");
        String curso = entrada.nextLine();

        String situacao;

        if (nota >= 7){
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Curso: " + curso);
        System.out.println("Situação: " + situacao);

        for (int i = 1; i <=5; i++) {
            System.out.println("Estudar Java é ótimo!");
            System.out.println("Mas só as vezes :D");

        }
    }
}

// Atividade 02
// Eraldo Junior

