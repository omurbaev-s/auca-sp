import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int T = inp.nextInt();
        int[] N = new int[1000];
        if(T>=2 && T<=50){
            for(int i=0, j=0; i< N.length; i++){
                N[i]=j;
                j++;
                if(j==T){
                    j=0;
                }
            }
            for(int i=0; i< N.length; i++){
                System.out.printf("N[%d] = %d%n", i, N[i]);
            }
        }
    }
}
