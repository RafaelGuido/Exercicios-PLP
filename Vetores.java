package vetores;

public class Vetores {

    public static void main(String[] args) {

        int x[] = new int[10];

        x[9] = 8;

        System.out.println("O vetor x no indice 9 é: " + x[9]);
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 3;
        };

        for (int i = 0; i < x.length; i++) {
            System.out.println("indice: " + i + " valor: " + x[i]);
        }

    }

    /*
        int[] lista = {500, 1000, 1500};
        int tamanho = lista.length;
        
        System.out.println(lista[0]);
     */
}

