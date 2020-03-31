package exemploif2;

import java.util.Scanner;

public class ExemploIf2 {

    public static void main(String[] args) {
      
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um Número:");
        numero = s.nextInt();
        
        if (numero > 0){
            System.out.printf("O numero digitado é positivo");
        }
        else{
            System.out.println("O numero digitado é negativo");
        }
    }
    
}
