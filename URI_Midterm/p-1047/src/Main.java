import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x1 = inp.nextInt();
        int x2 = inp.nextInt();
        int y1 = inp.nextInt();
        int y2 = inp.nextInt();
        int m;
        int h;

        if(x1==y1 && x2==y2){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } if(x1==y1 && x2<y2){
            h=0;
            m=y2-x2;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        } if(x1==y1 && x2>y2){
            h=24-1;
            m=(60-x2)+y2;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        } if(x1<y1 && x2==y2){
            h=y1-x1;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E 0 MINUTO(S)");
        } if(x1>y1 && x2==y2){
            h=(23-x1)+y1+1;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E 0 MINUTO(S)");
        } if(x1<y1 && x2<y2){
            h=y1-x1;
            m=y2-x2;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        } if(x1<y1 && x2>y2){
            h=y1-x1-1;
            m=(60-x2)+y2;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        } if(x1>y1 && x2>y2){
                h=(23-x1)+y1;
                m=(60-x2)+y2;
                System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
            } if(x1>y1 && x2<y2){
            h=(23-x1)+y1+1;
            m=y2-x2;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }

    }
}
