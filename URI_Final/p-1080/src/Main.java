import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int position =0;
        int hNumber = 0;
        int n = 100, x;

        for(int i=1; i<=n;i++){
            x = inp.nextInt();

            if(hNumber>x){
                hNumber=hNumber;
                position=position;
            } else{
                hNumber=x;
                position=i;
            }

        }
        System.out.println(hNumber);
        System.out.println(position);

    }
}
