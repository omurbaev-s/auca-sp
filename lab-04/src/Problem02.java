import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Month? ");
        int m = inp.nextInt();

        if (m<1 || m>12) {
            System.out.println(m+" is not a correct number");
        } else if ( m==12 || m==1 || m==2){
            System.out.println("Winter");
        } else if (m==3 || m==4 || m==5) {
            System.out.println("Spring");
        } else if (m==6 || m==7 || m==8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
