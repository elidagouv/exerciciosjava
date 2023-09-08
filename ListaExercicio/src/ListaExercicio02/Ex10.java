import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor N maior que zero: ");
        int N = input.nextInt();
        
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("N deve ser maior que zero.");
        }
        
        input.close();
    }
}
