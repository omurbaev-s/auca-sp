import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int a, b;
        double d;

        for(int i=0; i<n;++i){
            a = inp.nextInt();
            b = inp.nextInt();

            if (b==0){
                System.out.println("divisao impossivel");
            } else {
                d = (float)a/b;
                System.out.printf("%.1f%n",d);
            }

        }


    }
}
