import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int vInter = 0;
        int vGremio = 0;
        int nGames = 1;
        int draws = 0;

        int V = inp.nextInt();
        int G = inp.nextInt();
        System.out.println("Novo grenal (1-sim 2-nao)");
        int x = inp.nextInt();
        if(V>G){
            vInter++;
        } else if (V==G){
            draws++;
        } else{
            vGremio++;
        }

        while(x!=2){
            if(x==1){
                V= inp.nextInt();
                G= inp.nextInt();
                if(V>G){
                    vInter++;
                } else if(V<G){
                    vGremio++;
                } else{
                    draws++;
                }
                System.out.println("Novo grenal (1-sim 2-nao)");
                x = inp.nextInt();
            }
            nGames++;
        }
        System.out.println(nGames+" grenais");
        System.out.println("Inter:"+vInter);
        System.out.println("Gremio:"+vGremio);
        System.out.println("Empates:"+draws);
        if(vInter>vGremio){
            System.out.println("Inter venceu mais");
        } else if(vGremio>vInter){
            System.out.println("Gremio venceu mais");
        } else{
            System.out.println("Não houve vencedor");
        }

    }
}
