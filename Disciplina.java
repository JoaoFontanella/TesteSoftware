public class Disciplina {
    public static void main(String[] args) {
        Aluno t1 = new Aluno();
        t1.nome = "caruzo ";;
        t1.periodo = "integral";
        t1.turma = 353;
        t1.n1 = 2.5f;
        t1.n2 -= 4.0f;
        t1.media=(t1.n1 + t1.n2)/2;
        t1.disciplina = "Matematica";

        System.out.println(t1.nome+ t1.periodo + t1.media);


        Aluno t2 = new Aluno();
        t2.nome= "pedro ";
        t2.periodo = "integral";
        t2.turma = 323;
        t2.n1 = 0.0f;
        t2.n2 = 1.0f;
        t2.media=(t2.n1 + t2.n2)/2;
        t2.disciplina = "Matematica";
        System.out.println("" + t2.nome + t2.periodo + t2.media);


        Aluno t3 = new Aluno();
        t3.nome = "maria ";
        t3.periodo = "integral";
        t3.turma = 343;
        t3.n1 = 0.0f;
        t3.n2 = 1.0f;
        t3.media=(t3.n1 + t3.n2)/2;
        t3.disciplina = "Matematica";
        System.out.println(""+ t3.nome+ t3.periodo + t3.media);

        Aluno t4 = new Aluno();
        t4.nome = "joao";
        t4.periodo = "manha";
        t4.turma = 343;
        t4.n1 = 0.0f;
        t4.n2 = 1.0f;
        t4.media=((t3.n1 + t3.n2)/2);
        t4.disciplina = "filosofia";
        System.out.println(""+ t4.nome + t4.periodo + t4.media);

        
        System.out.println();
        
    }   
}         
    
