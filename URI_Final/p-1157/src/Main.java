import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        for(int i=1; i<=N; i++){
            if(N%i==0){
                System.out.println(i);
            }
        }
    }
}
