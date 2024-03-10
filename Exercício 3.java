import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = scanner.next();

        System.out.println("Olá, " + nome + "! Bem-vindo!");

        scanner.close();
    }
}