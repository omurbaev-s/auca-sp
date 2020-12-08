import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Coordinate of your point: ");
        int n = inp.nextInt();
        System.out.println("Coordinate of 1st point: ");
        int x = inp.nextInt();
        System.out.println("Coordinate of 2nd point: ");
        int y = inp.nextInt();

        int d1 = abs(x-n);
        int d2 = abs(y-n);
        if (d1 < d2) {
            System.out.printf("1st point is closer. Distance is %d%n", d1);
        } else if (d2 < d1) {
            System.out.printf("2nd point is closer. Distance is %d%n", d2);
        } else {
            System.out.printf("Distance are the same and equal to %d%n", d1);
        }
    }
                static int abs(int N){
                    int r = N;
                    if(r<0){
                        r=-r;
                    }
                    return r;

    }
}
