import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] A = new double[100];
        for(int i=0; i< A.length; i++){
            A[i]= inp.nextDouble();
        }
        for(int i=0; i< A.length; i++){
            if(A[i]<=10){
                System.out.printf("A[%d] = %.1f%n", i, A[i]);
            }
        }

    }
}
