import java.util.Scanner;

public class RaizesEquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os coeficientes da equação de segundo grau (Ax^2 + Bx + C):");
        System.out.print("A: ");
        double A = scanner.nextDouble();
        
        System.out.print("B: ");
        double B = scanner.nextDouble();
        
        System.out.print("C: ");
        double C = scanner.nextDouble();
        
        double delta = B * B - 4 * A * C;
        
        if (delta >= 0) {

            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            

            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        
        scanner.close();
    }
}