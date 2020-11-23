import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0): ");
         int integer = inp.nextInt();
         int sum = 0;

         while (integer!=0){
             sum += integer;
             System.out.print("Enter an integer (the input ends if it is 0): ");
             integer = inp.nextInt();
         }
        System.out.println("The sum is "+sum);





    }
}
