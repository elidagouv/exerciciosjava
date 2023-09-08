import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;
        
        do {
            double nota1, nota2;

            do {
                System.out.print("Informe a primeira nota (0 a 10): ");
                nota1 = input.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Informe a segunda nota (0 a 10): ");
                nota2 = input.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno é: " + media);

            System.out.print("NOVO CÁLCULO (S/N)? ");
            continuar = input.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');
        
        input.close();
    }
}
