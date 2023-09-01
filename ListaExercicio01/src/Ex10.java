import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = scanner.nextDouble();

        double comissao = 0.03; // 3% sobre o total das vendas até R$ 1.500
        double comissaoExtra = 0.05; // 5% sobre o que ultrapassar R$ 1.500
        double limiteComissao = 1500.00;

        double totalComissao;

        if (valorVendas <= limiteComissao) {
            totalComissao = valorVendas * comissao;
        } else {
            totalComissao = (limiteComissao * comissao) + ((valorVendas - limiteComissao) * comissaoExtra);
        }

        double salarioTotal = salarioFixo + totalComissao;

        System.out.println("Salário total do vendedor: R$ " + salarioTotal);

        scanner.close();
    }
}