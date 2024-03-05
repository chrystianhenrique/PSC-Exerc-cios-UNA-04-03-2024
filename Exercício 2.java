import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
       int numero1 = scanner.nextInt ();

       System.out.print("Digite o segundo número:");
       int numero2 = scanner.nextInt();

       int divisao = numero1 / numero2;

       System.out.println("O resto da divisão de " + numero1 + " e " + numero2 + " é igual a " + divisao); 
    }
}



