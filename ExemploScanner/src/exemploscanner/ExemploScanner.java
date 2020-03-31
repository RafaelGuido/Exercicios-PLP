package exemploscanner;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = s.next();
        System.out.println("Digite sua idade:");
        int idade = s.nextInt();
        System.out.println("Seu nome é "+nome+" e você tem "+idade+" anos.");
    }
    
}
