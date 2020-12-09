import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x;
        while((x= inp.nextInt())!=0){
            for(int i=1; i<=x-1; i++){
                System.out.print(i+" ");
            }
            System.out.println(x);
        }
    }
}
