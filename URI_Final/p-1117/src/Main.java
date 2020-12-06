import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x = inp.nextDouble();
        double scores = 0;
        double sum = 0;
        double  media = 0;

        while(scores!=2){
            x = inp.nextDouble();
            if(x>=0 && x<=10){
                sum += x;
                scores++;
            } else if(x<0 && x>10){
                System.out.println("nota invalida");
            }
        }
        media = sum/2;
        System.out.printf("media = %.2f%n", media);
    }
}
