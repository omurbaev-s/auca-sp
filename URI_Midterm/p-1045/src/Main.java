import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();



        if (a>=b+c || c>=b+a || b>=a+c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a*a)==(b*b)+(c+c) || (b*b)==(a*a)+(c*c) || (c*c)==(a*a)+(b*b)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if ((a*a)>(b*b)+(c*c) || (b*b)>(c*c)+(a*a) || (c*c)>(a*a)+(b*b)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((a*a)<(b*b)+(c*c) || (b*b)<(c*c)+(a*a) || (c*c)<(a*a)+(b*b)) {
            System.out.println("TRIANGULO ACUTANGULO");
        } if (a==b && b==c) {
            System.out.println("TRIANGULO EQUILATERO");
        } if ((a==b && b!=c ) || (a==c && c!=b) || (c==b && b!=a)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
