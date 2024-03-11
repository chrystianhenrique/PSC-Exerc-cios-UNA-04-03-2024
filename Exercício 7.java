import java.util.Scanner;

public class App {
    public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Digite o valor o salario do funcionario: ");
double salario = scanner.nextInt ();

double reajusteSalario = salario * 0.07;

double novoSalario = salario + reajusteSalario;

System.out.println ("O salario reajustado é: R$ " + novoSalario);
scanner.close();
    }
}
