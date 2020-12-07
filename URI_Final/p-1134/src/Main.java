import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = 0;
        int g = 0;
        int d = 0;
        int n = inp.nextInt();
        while(n!=4){
            if(n==1){
                a++;
            } else if(n==2){
                g++;
            } else{
                d++;
            }
            n = inp.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
}
