
import javax.swing.JOptionPane;
import java.util.Scanner;
public class IdadeCondicional{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade=scan.nextInt();
        if(idade <= 3){
            JOptionPane.showMessageDialog(null, "Bebe");
        }
        if((idade >= 4) && (idade <=9)){
            JOptionPane.showMessageDialog(null, "Criança");
    }
    if((idade >= 10) && (idade <=13)){
        JOptionPane.showMessageDialog(null, "Pré-Adolescente");
    }
    if((idade >= 14) && (idade <=17)){
        JOptionPane.showMessageDialog(null, "Adolescente");
    }
    if((idade >=18 ) && (idade <=24)){
        JOptionPane.showMessageDialog(null, "Jovem");
    }
    if((idade >=25 ) && (idade <=40)){
        JOptionPane.showMessageDialog(null, "Meia-Idade");
    }
    if((idade >=41 ) && (idade <=60)){
        JOptionPane.showMessageDialog(null, "Novo,Cheio de Ruga");
}
 }
}


