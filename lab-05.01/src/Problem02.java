import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Integer? ");
        int integer = inp.nextInt();
        int s = 0;

        while(integer!=0){
            s += integer%10;
            integer/=10;
        }
        System.out.println("The sum of all digits is "+s);
    }
}
