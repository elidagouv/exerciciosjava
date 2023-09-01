import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
        
		switch(Integer.signum(valor)) {
            case 1:
            case 0:
                System.out.println("O valor é positivo.");
                break;
            case -1:
                System.out.println("O valor é negativo.");
                break;
        }

        scanner.close();
    }
}