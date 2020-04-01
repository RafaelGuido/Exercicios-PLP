package comandorepeticao;

public class ComandoRepeticao {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        
        System.out.println();
        
        for (int x = 0; x < 8; x++) {
            System.out.println(x);
            if (x == 5) {
                continue;
            }
        }

    }
}