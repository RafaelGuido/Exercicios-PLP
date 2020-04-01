package exemplocondicionais;

import java.util.Scanner;

public class ExemploCondicionais {

    public static void main(String[] args) {
        // Verificar se o número é positivo ou negativo
         int num;
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Digite um múmero:");
         num = keyboard.nextInt();
         if (num > 0) {
             System.out.println("Número positivo");
         } else if (num < 0) {
             System.out.println("Número negativo");
         }else{
             System.out.println("Número nulo");
         }
         
    }
    
}