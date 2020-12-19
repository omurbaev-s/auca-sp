import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double X = inp.nextDouble();
        double[] N = new double[100];
        N[0]=X;
        System.out.printf("N[%d] = %.4f%n", 0, N[0]);
        for(int i=1; i< N.length; i++){
           N[i]=X/2;
           X=X/2;
            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }
    }
}
