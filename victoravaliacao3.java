import java.util.Scanner;

public class victoravaliacao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite osalario-base do fumcionario: R$ ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = scanner.nextDouble();

        double aumetnto = salarioBase * (percentual / 100);
        double salarioFinal = salarioBase + salarioBase;
        System.out .printf("O salario final com reajuste é R$ %2f\n" , salarioFinal);
    }
}

