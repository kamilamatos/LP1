
package Main;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "a";
        String b= "Oi";
        String c= "Bbbb";
        
        // verifica se as strings são iguais
        if(b.equals(c)){
            System.out.println("São iguais");
        } else{
            System.out.println("Não são iguais");
        }
        
        //compara as strings
        if(a.compareTo(b)>0){
            System.out.println("sA é menor(em ordem alfabetica sA vem primeiro) que sB");
        }
        else if(a.compareTo(b)==0){
            System.out.println("sA == sB");
        }
        else if(a.compareTo(b)<0){
            System.out.println("sA é maior que sB");
        }
        
        }
            
    }

    

