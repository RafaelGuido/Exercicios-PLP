package switchcase;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        float num1, num2;
        char operation;

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Informe o primeiro número:");
        num1 = keyboard.nextFloat();
        
        System.out.println("Informe o segundo número:");
        num2 = keyboard.nextFloat();
        
        System.out.println("Informe a operação [+ - * /]:");
        operation = keyboard.next().charAt(0);
        
        System.out.println("");
        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operação invalida!");
        }
        
    }
}
