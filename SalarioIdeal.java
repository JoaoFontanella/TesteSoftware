

import java.util.Scanner;

public class SalarioIdeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer aluguel, alimento, contas, transporte, med, salario1, salario2, fralda;

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
        System.out.println("Digite o valor a ser gasto com fraldas:");
        fralda = scanner.nextInt();
        salario1 = (aluguel + alimento + contas + transporte + med + fralda);
        salario2 = (salario1 * 2);
        System.out.println("Salario ideal: " + salario2);
    }
}