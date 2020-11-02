import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double p = a+b+c;

        if(a+b>c && b+c>a && a+c>b && a!=0 && b!=0 && c!=0) {
            System.out.println("Perimeter of triangle: "+p);
        } else {
            System.out.println("The inputs are invalid");
        }
    }
}
