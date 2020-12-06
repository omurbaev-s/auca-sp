import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x;
        double scores = 0;
        double sum = 0;
        double  media = 0;

        while(scores!=2){
            x = inp.nextDouble();
            if(x<0.0 || x>10.0){
                System.out.println("nota invalida");
            } else {
                sum += x;
                scores++;
            }
        }
        media = sum/2;
        System.out.printf("media = %.2f%n", media);
    }
}
