import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("complexity level? ");
        int n = inp.nextInt();


        if (n<0 || n>5) {
            System.out.println(n+"is out of the range");
        } if (n==5 || n==4) {
            System.out.println("You are a pro gamer");
        }  else if (n==2 || n==3) {
            System.out.println("You are an experienced gamer.");
        } else if (n==1) {
            System.out.println("You are a beginner.");
        } else if (n==0) {
            System.out.println("You are total newbie");
        }
    }
}
