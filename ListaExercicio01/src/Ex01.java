import java.util.Scanner;
import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();

		if (valor > 10) {
			System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
