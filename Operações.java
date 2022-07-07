
import java.util.Scanner;
public class Operações{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,vezes,soma,sub;
        float div;
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextInt(); 
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        soma = n1 + n2;
        sub = n1 - n2;
        vezes = n1 * n2;
        div = n1 / n2;
        System.out.println("O resultado da soma é: "+ soma);
        System.out.println("O resultado da subtração é: "+ sub);
        System.out.println("O resultado da multiplicação é: "+ vezes);
        System.out.println("O resultado da divisão é: "+ div);
    }
}
