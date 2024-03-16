import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();
        
        int antecessor = valor - 1;
        int sucessor = valor + 1;
        
        System.out.println("O antecessor de " + valor + " é: " + antecessor);
        System.out.println("O sucessor de " + valor + " é: " + sucessor);
        
        scanner.close();
    }
}