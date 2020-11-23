import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of test? ");
        int n = inp.nextInt();
        int c = 0;
        int in = 0;
        int i = 0;

        while(i<n){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            System.out.print(number1+" + "+number2+" = ");
            int answer = inp.nextInt();

            if (number1+number2==answer){
                c = c+1;
            } else {
                in = in+1;
            } ++i;
        }
        System.out.println("Number of correct answers: "+c);
        System.out.println("Number of incorrect answers: "+in);

    }
}
