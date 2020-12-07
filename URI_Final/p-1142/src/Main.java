import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x =3;
        int y =1;

        for(int i=1; i<=n;i++){
            for(int j=1, k=y; j<=x;k++){
                System.out.print(k+" ");
                j++;
            }
            System.out.println("PUM");
            y+=4;
        }
    }
}
