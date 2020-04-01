package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {

        int num1, num2, maior;
        num1 = 10;
        num2 = 20;

        // Operação ternária
        maior = (num1 > num2) ? num1 : num2;

        System.out.println("O número maior é " + maior);

    }
}