import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] X= new int[10];
        for(int i=0; i< X.length; i++){
            X[i]= inp.nextInt();
        }
        for(int i=0; i< X.length; i++){
            if(X[i]==0 || X[i]<0){
                X[i]=1;
            }
            System.out.printf("X[%d] = %d%n", i, X[i]);
        }
    }
}
