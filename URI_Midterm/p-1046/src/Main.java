import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        int h;

        if (x==y){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } if (x>y){
            h=(23-x)+y+1;
            System.out.println("O JOGO DUROU "+h+" HORA(S)");
        } if (x<y){
            h=y-x;
            System.out.println("O JOGO DUROU "+h+" HORA(S)");
        }



    }
}
