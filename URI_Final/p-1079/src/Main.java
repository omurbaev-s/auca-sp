import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        double a;
        double b;
        double c;
        double average;

        for(int i=0;i<x;i++){

            a = inp.nextDouble();
            b = inp.nextDouble();
            c = inp.nextDouble();

            average = ((a*2.0)+(b*3)+(c*5))/10;
            System.out.printf("%.1f\n",average);

        }


    }
}