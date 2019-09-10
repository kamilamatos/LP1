package main;

public class Main {

    public static void main(String[] args) {
        
        Entrada entrada = new Entrada();
        int a = entrada.lerNumeroInteiro("Digite o primeiro valor");
        int b = entrada.lerNumeroInteiro("Digite o segundo valor");
        int c = entrada.lerNumeroInteiro("Digite o terceiro valor");
        int d = entrada.lerNumeroInteiro("Digite o quarto valor");
        int e = entrada.lerNumeroInteiro("Digite o quinto valor");
        
        
        Processamento processamento = new Processamento();
        int resposta= processamento.vernegativos(a,b,c,d,e);
     
        
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro(resposta, "Quantidade de números negativos ");
      

    }

}

