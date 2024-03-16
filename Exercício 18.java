import java.util.Scanner;

public class NumeroDegraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura de cada degrau (em metros): ");
        double alturaDegrau = scanner.nextDouble();
        
        System.out.print("Digite a altura desejada (em metros): ");
        double alturaDesejada = scanner.nextDouble();
        
        int numDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        System.out.println("Para alcançar a altura desejada, você precisa subir " + numDegraus + " degraus.");
        
        scanner.close();
    }
}