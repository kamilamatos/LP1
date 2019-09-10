package Main;

/**
 *
 * @author radames
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        String original = entrada.lerString("Digite uma string");
        original = original.trim();//eliminar espaços em branco no inicio e/ou final da string original
        System.out.println("Original =>" + original);
        String invertida = "";

        Processamento processamento = new Processamento();
        invertida = processamento.inverterString(original);//chama método para inverter a string
        System.out.println("Invertida =>" + invertida);

        original = processamento.removerEspacosEmBranco(original);//remove os espaços em branco
        invertida = processamento.removerEspacosEmBranco(invertida);//remove os espaços em branco

        if (original.equals(invertida)) {
            System.out.println("é palindromo");
        } else {
            System.out.println("não é palindromo");
        }
    }

}
