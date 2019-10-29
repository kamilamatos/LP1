package main;
// metodo construtor; executado no momento em que instancia a classe.
// classe Tools; 

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        // entrada de dados
        //parametros de um metodo; valor que vem de fora da classe.
        
       
        aluno.setRA("A123");
        aluno.setNome("Kamila");
        aluno.setCoef(0.82);
        aluno.setEmail("kamilamatos@alunos.utfpr.edu.br");
        //controle.adicionar(aluno);
        
        // imprime os dados
        
        System.out.println(aluno.toString());
        System.out.println("----------");
        
        aluno = new Aluno("A456","Luanna", 0.77, "luakmatos@hotmail.com");
        System.out.println(aluno);
        //controle.adicionar(aluno);
        
        //LIst<Aluno> la= controle.listar();
        // for (Aluno oAluno : la){ sout(oAluno.toString());  }
        
        
        

    }

}
