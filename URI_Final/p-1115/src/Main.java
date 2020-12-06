import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        while (((x = input.nextInt()) != 0 )&&((y = input.nextInt()) != 0 )){
            if(x>0 && y>0){
                System.out.println("primeiro");
            } if(x>0 && y<0){
                System.out.println("quarto");
            } if(x<0 && y<0){
                System.out.println("terceiro");
            } if(x<0 && y>0){
                System.out.println("segundo");
            }
        }
    }
}
