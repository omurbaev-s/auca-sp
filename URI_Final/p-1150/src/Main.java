import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int X = inp.nextInt();
        int Z = inp.nextInt();
        int sum = 0;
        int x = 0;

        while(Z<=X) {
            Z = inp.nextInt();
        }
            for(int i=1; x<=Z;i++){
                x+=X;
                X++;
                sum=i;
            }
        System.out.println(sum);
    }
}
