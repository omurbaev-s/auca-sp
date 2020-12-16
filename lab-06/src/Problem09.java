import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = inp.nextInt();
        System.out.printf("%.4f%n", computingPi(i));
    }
    public static double computingPi(int number){
        double m = 0;
        for(int i=1; i<=number; i++){
            m+= 4*(Math.pow((-1.0),(i+1))/((2*i)-1));
        }
        return m;
    }
}
