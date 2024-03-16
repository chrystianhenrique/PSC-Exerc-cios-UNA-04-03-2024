import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        String Formatado = String.format("%.2f", celsius);

        System.out.println(fahrenheit + "ºF é equivalente a " + Formatado + "ºC.");

        scanner.close();
    }
}