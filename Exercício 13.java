import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualINSS = scanner.nextDouble();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        
        double descontoINSS = (salarioBruto * percentualINSS) / 100;
        
        double salarioLiquido = salarioBruto - descontoINSS;
        

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Desconto do INSS: R$" + descontoINSS);
        System.out.println("Salário líquido: R$" + salarioLiquido);
        
        scanner.close();
    }
}