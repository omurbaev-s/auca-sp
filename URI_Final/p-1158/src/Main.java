import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int N = inp.nextInt();
        for(int i=1; i<=N; i++){
            int X = inp.nextInt();
            int Y = inp.nextInt();
            for(int j=1; j<=Y;X++){
                if(X%2!=0){
                    sum+=X;
                    j++;
                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
