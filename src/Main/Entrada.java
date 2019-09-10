package Main;

import java.util.Scanner;

/**
 *
 * @author radames
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);
    
    public String lerString(String mensagem){
        String s;
         while (true) {
            try {
                System.out.print(mensagem + "=>");
                s = teclado.nextLine();
                if (!s.trim().equals("")) {//se não for uma string vazia
                    return s;
                }
                
            } catch (Exception e) {
                System.out.println("Erro, a String não pode ser vazia, tente novamente....");
                teclado = new Scanner(System.in);
            }
        }
    }

    int lerNumeroInteiro(String mensagem) {
        int numero = 0;
        while (true) {
            try {
                System.out.print(mensagem + "=>");
                numero = teclado.nextInt();
                return numero;
            } catch (Exception e) {
                System.out.println("Erro, tente novamente....");
                teclado = new Scanner(System.in);
            }
        }
    }

    double lerNumeroDouble(String mensagem) {
        double numero = 0;
        while (true) {
            try {
                System.out.print(mensagem + "=>");
                numero = teclado.nextDouble();
                return numero;
            } catch (Exception e) {
                System.out.println("Erro, tente novamente....");
                teclado = new Scanner(System.in);
            }
        }
    }
}
