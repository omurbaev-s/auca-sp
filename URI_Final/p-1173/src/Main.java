import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int V = inp.nextInt();
        int[] N = new int[10];
        N[0]=V;
        System.out.printf("N[%d] = %d%n", 0, N[0]);
        for(int i=1; i< N.length; i++){
            N[i]=V*2;
            V=V*2;
            System.out.printf("N[%d] = %d%n", i, N[i]);
        }
    }
}
