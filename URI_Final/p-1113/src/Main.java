import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        int y;

        do {
            x = inp.nextInt();
            y = inp.nextInt();

            if(x>y){
                System.out.println("Decrescente");
            } else if (x<y){
                System.out.println("Crescente");
            }

        } while(x!=y);
    }
}
