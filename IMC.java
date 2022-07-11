import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        Float peso,altura,imc;
        String aux="";
        try{
            aux = JOptionPane.showInputDialog("Peso");
            peso = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Altura");
            altura = Float.parseFloat(aux);

            imc=peso/(altura*altura);
            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, "Seu IMC esta abaixo do normal: "+ imc);
                
            }
            if ((imc >= 18.5)&&(imc <= 29.9)) {
                JOptionPane.showMessageDialog(null, "Seu IMC é o ideal: "+ imc);
                
            }
            if ((imc >= 30)&&(imc <= 34.9)) {
                JOptionPane.showMessageDialog(null, "Seu IMC está em Obesidade classe 1: "+ imc);
        }
        if ((imc <= 35)&&(imc >= 39.9)) {
            JOptionPane.showMessageDialog(null, "Seu IMC está em Obesidade morbida: "+ imc);
        }
    }

        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Apenas Numeros");

        }
        
    }

    
}