import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        for(int X= inp.nextInt(); X!=0; X= inp.nextInt()){
            for(int i=1; i<=5; X++){
                if(X%2==0){
                    sum+=X;
                    i++;
                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
