import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();

        if (x < y) {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                if (i % 13 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } else if(x>y){
            int sum2 = 0;
            for(int i = y; i<=x; i++){
                if(i%13==0){
                    sum2+=i;
                }
            }
            System.out.println(sum2);
        }
    }

}
