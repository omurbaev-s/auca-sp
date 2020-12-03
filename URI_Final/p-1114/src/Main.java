import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p = inp.nextInt();

        while(p!=2002){
            System.out.println("Senha Invalida");
            p = inp.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
