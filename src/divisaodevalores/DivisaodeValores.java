
package divisaodevalores;

import java.util.Scanner;


public class DivisaodeValores {

    
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,result;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o Primeiro Número: ");
        a = teclado.nextFloat();
        System.out.println("Informe o Segundo Número: ");
        b = teclado.nextFloat();
         
       while(b == 0){
           System.out.println("Informe um valor válido:");
           b  = teclado.nextFloat();
          
       }if(b != 0){
           result= a/b;
           System.out.println("Resultado da divisão é: "+result);
       
       }
        
    }
    
}
