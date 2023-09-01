import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double menorValor = Math.min(valor1, valor2);
        double maiorValor = Math.max(valor1, valor2);

        System.out.println("Valores em ordem crescente: " + menorValor + ", " + maiorValor);

        scanner.close();
    }
}