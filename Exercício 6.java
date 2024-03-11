import java.util.Scanner;

public class App {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print ("Digite a idade:");
int idade = scanner.nextInt();

int diasVividos = idade * 365;

System.out.println("Esta pessoa já viveu " + diasVividos + " dias.");

scanner.close();
        
    }
}
