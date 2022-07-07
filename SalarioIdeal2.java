

import java.util.Scanner;

public class SalarioIdeal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer aluguel, alimento, contas, transporte, med, salario1, salario2, gastogeral, salduplo;

        System.out.println("Digite o valor do aluguel:");
        aluguel = scanner.nextInt();
        System.out.println("Digite o valor gasto em alimentos:");
        alimento = scanner.nextInt();
        System.out.println("Digite o valor gasto em contas:");
        contas = (int) scanner.nextInt();
        System.out.println("Digite o valor gasto com transporte:");
        transporte = scanner.nextInt();
        System.out.println("Digite o valor a ser gasto com medicos e medicamentos:");
        med = scanner.nextInt();
        System.out.println("Digite os gastos em geral:");
        gastogeral = scanner.nextInt();
        salario1 = (aluguel + alimento + contas + transporte + med + gastogeral);
        salario2 = (salario1 * 2);
        System.out.println("Salario ideal para umas pessoa: " + salario2);
        salduplo = (salario2 * 2);
        System.out.println("Salario ideal para dua pessoas: " + salduplo);
    }
}
