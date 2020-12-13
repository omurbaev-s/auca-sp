import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Integer? ");
        int integer = inp.nextInt();
        int s = sumDigits(integer);


        System.out.println("The sum of all digits is "+s);
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
