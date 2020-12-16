import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an integer? ");
        int x = inp.nextInt();
        if(isPalindrome(x)){
            System.out.println(x+" is a Palindrome");
        } else {
            System.out.println(x+" is not a Palindrome");
        }

    }

    public static int reverse(int number) {
        int r = 0;
        while (number != 0) {
            r = r * 10;
            r = r + number % 10;
            number /= 10;
        }
        return r;
    }
    public static boolean isPalindrome(int number){

        if(number==reverse(number)) {
            return true;
        }
        return false;
    }
}