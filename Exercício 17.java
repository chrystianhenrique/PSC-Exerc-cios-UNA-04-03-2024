import java.util.Scanner;

public class CustoCaneta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de canetas compradas: ");
        int numeroCanetas = scanner.nextInt();
        
        System.out.print("Digite o valor pago (em reais): ");
        double valorPago = scanner.nextDouble();
        
        System.out.print("Digite o valor do troco recebido (em reais): ");
        double trocoRecebido = scanner.nextDouble();

        double valorTotal = valorPago - trocoRecebido;
        
        double custoPorCaneta = valorTotal / numeroCanetas;
        
        System.out.println("O custo de cada caneta é de: R$" + custoPorCaneta);

        scanner.close();
    }
}