
import java.util.Scanner;
public class Combustivel{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dist,comb;
        float total;
        System.out.println("Digite a distancia percorrida pelo automovel: ");
        dist = entrada.nextInt(); 
        System.out.println("Digite o total de combustivel do automovel: ");
        comb = entrada.nextInt();
        total = dist / comb;
        System.out.println("O consumo medio do automovel é de: "+total);
    }
}