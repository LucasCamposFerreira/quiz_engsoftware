import java.util.Scanner;

public class Header {
    public static void writeHeader () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira seu nome: ");
        String username = scanner.nextLine();

        System.out.println("Faculdade Unifan");
        System.out.println("Aluno - " + username);
        System.out.println("Professor Brenno Pimenta");
        System.out.println("Turma - ESNB2");
        System.out.println("Agora você terá de realizar quinze perguntas sobre CorelDRAW, ao final, lhe será dado um percentual de acertos e de erros");
        System.out.println("Aperte em qualquer tecla para seguir.");
        String anyKey = scanner.nextLine();

        Questions.main(new String[]{username});
    }
}
