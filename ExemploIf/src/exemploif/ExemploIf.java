package exemploif;

import java.util.Scanner;

public class ExemploIf {

    public static void main(String[] args) {
        
        int num1, num2, soma;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o valor do primeiro numero");
        num1 = s.nextInt();
        System.out.println("Entre com o valor do segundo numero");
        num2 = s.nextInt();
        soma = (num1+num2);
        
        if (soma>10) {
            System.out.printf("Soma dos dois números = %d",(soma));
        }
        else{
            System.out.println("A soma foi menor que o numero 10.");
        }
    }
    
}
