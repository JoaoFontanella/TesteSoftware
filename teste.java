package idade;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer idade;
        String sexo;

        System.out.println("Digite a idade da pessoa: ");
        idade = entrada.nextInt();

        System.out.println("Digite o sexo da pessoa M ou F: ");
        sexo = entrada.next();

        if ((sexo != "F") && (idade > 17)) {
            System.out.println("Você foi cadastrado com sucesso");
        } else
            System.out.println("Seu cadastro não foi feito ");
    }
}