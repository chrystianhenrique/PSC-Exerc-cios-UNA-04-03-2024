import java.util.Scanner;

public class CalculadoraIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a porcentagem do IPI a ser acrescida (%): ");
        double ipiPercentual = scanner.nextDouble();
        
        System.out.println("Insira os dados da peça 1:");
        System.out.print("Código da peça: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Valor unitário da peça (em reais): ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Quantidade de peças: ");
        int quantidadePecas1 = scanner.nextInt();
        
        // Solicita ao usuário que insira os dados da peça 2
        System.out.println("Insira os dados da peça 2:");
        System.out.print("Código da peça: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Valor unitário da peça (em reais): ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Quantidade de peças: ");
        int quantidadePecas2 = scanner.nextInt();
        
        double valorTotalSemIPI = (valorUnitarioPeca1 * quantidadePecas1) + (valorUnitarioPeca2 * quantidadePecas2);
        
        double valorTotalComIPI = valorTotalSemIPI * (1 + (ipiPercentual / 100));
        
        System.out.println("O valor total a ser pago, com IPI, é: R$" + valorTotalComIPI);
        
        scanner.close();
    }
}