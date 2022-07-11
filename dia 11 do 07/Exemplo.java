import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        int idade;
        String aux="";
        float n1=0,n2=0,trab=0,med=0;
        try{
            aux = JOptionPane.showInputDialog("Nota1");
            n1 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Nota2");
            n2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Trabalho");
            trab = Float.parseFloat(aux);

            med=(n1+n2+trab)/3;
            JOptionPane.showMessageDialog(null, "Media: "+ med);
        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Apenas Numeros, Maluko");
        }
    }
}
