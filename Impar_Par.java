

public class Impar_Par {
    public static void main(String[] args) {
        long par = 1;
        int impar = 0;
        int n1;
        for(n1=0;n1<=30;n1++){
           if (n1 % 2 == 1){
               impar+=n1;
        } else {
            if (n1>0)
            par*=n1;
   }
  }
  System.out.println("Soma dos numeros imparares " + impar);
  System.out.println("Multiplicação dos numeros pares " + par);
}
}