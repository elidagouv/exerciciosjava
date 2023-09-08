import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroValor, segundoValor;
        
        System.out.println("Informe o primeiro valor: ");
        primeiroValor = input.nextDouble();
        
        do {
            System.out.println("Informe o segundo valor (não pode ser zero): ");
            segundoValor = input.nextDouble();
            
            if (segundoValor == 0) {
                System.out.println("O segundo valor não pode ser zero. Tente novamente.");
            }
        } while (segundoValor == 0);
        
        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);
        
        input.close();
    }
}
