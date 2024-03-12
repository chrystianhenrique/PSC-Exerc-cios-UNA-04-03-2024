import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em metros: " );

        double metros = scanner.nextDouble();

        double centimetros = metros * 100; 

        System.out.println(metros + " metros é igual a " + centimetros + " centímetros");
    
        scanner.close();


        
      
    }
}
