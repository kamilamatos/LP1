package main;

import java.text.DecimalFormat;

/**
 *
 * @author radames
 */
class Saida {
    public void imprimirNumeroDouble(double num, String msg) {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(msg + "=>" + df.format(num));
    }

    public void imprimirAvisoString(String aviso) {
        System.out.println(aviso);
    }
    public void imprimirNumeroInteiro(int num, String msg){
        System.out.println(msg+ "=> "+ num);
        
    }
}
