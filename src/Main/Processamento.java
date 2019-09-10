package Main;

/**
 *
 * @author radames
 */
class Processamento {

    public String removerEspacosEmBranco(String s) {
        String[] aux = s.split(" ");
        String x = "";
        for (int i = 0; i < aux.length; i++) {
            x = x + aux[i];
        }
        return x;
    }

    public String inverterString(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida = invertida + s.charAt(i);
        }
        return invertida;
    }
}
