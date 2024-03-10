import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite seu primeiro nome
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        // Exibe uma saudação personalizada
        System.out.println("Olá, " + nome + "! Bem-vindo!");

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}