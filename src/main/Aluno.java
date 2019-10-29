
package main;

//classe Aluno como classe Entidade para reconhecimento dos atributos; 

public class Aluno {
    private String RA;
    private String nome;
    private double coef;
    private String email;
    
    // cria dois construtores;
    // o vazio para quando criar um aluno e depois atribuir suas caracteristicas 
    // o outro pra quando ao criar ja informa os atributos

   public Aluno() {
    }

    public Aluno(String RA, String nome, double coef, String email) {
        this.RA = RA;
        this.nome = nome;
        this.coef = coef;
        this.email = email;
    }
    
    // getter e setter + encapsular.
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    
    // to String, para enxergar oque acontece; 
    
    @Override
    public String toString() {
        return "Aluno{" + "RA = " + RA + ", nome = " + nome + ", coef = " + coef + ", email = " + email + '}';
    }


}
