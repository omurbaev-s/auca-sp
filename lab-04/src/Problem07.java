import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        int ran = (int) (Math.random()*999);
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your lottery pick: ");
        int pl = inp.nextInt();

        int lotteryDigit1 = ran/100;
        int lotteryDigit2 = (ran/10)%10;
        int lotteryDigit3 = (ran%10);

        int guessDigit1 = pl/100;
        int guessDigit2 = (pl/10)%10;
        int guessDigit3 = pl%10;

        if (pl<100 || pl>999) {
            System.out.println("It is a wrong number!");
        } else if (pl==ran) {
            System.out.println("The lottery number is "+ran);
            System.out.println("Exact match: you win $10,000");
        } else if (lotteryDigit1==guessDigit1 && lotteryDigit2==guessDigit3 && lotteryDigit3==guessDigit2
                ||lotteryDigit1==guessDigit2 && lotteryDigit2==guessDigit1 && lotteryDigit3==guessDigit3
                || lotteryDigit1==guessDigit3 && lotteryDigit2==guessDigit2 && lotteryDigit3==guessDigit1
                ||lotteryDigit1==guessDigit3 && lotteryDigit2==guessDigit1 && lotteryDigit3==guessDigit2) {
            System.out.println("The lottery number is "+ran);
            System.out.println("Match all digits: you win $3,000");
        } else if (lotteryDigit1==guessDigit1
        || lotteryDigit1==guessDigit2
        || lotteryDigit1==guessDigit3
        || lotteryDigit2==guessDigit1
        || lotteryDigit2==guessDigit2
        || lotteryDigit2==guessDigit3
        || lotteryDigit3==guessDigit1
        || lotteryDigit3==guessDigit2
        || lotteryDigit3==guessDigit3) {
            System.out.println("The lottery number is "+ran);
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("The lottery number is "+ran);
            System.out.println("Sorry, no match");
        }
    }
}
