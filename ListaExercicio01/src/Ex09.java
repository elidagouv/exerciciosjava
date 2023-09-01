import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasSemanais = 40; // Jornada de trabalho semanal
        int semanasPorMes = 4; // Número de semanas em um mês
        double salarioPorHora, salarioTotal;
        int horasTrabalhadas;

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        salarioPorHora = scanner.nextDouble();

        if (horasTrabalhadas <= horasSemanais * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
            double salarioHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasSemanais * semanasPorMes * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("Salário total do funcionário: R$ " + salarioTotal);

        scanner.close();
    }
}