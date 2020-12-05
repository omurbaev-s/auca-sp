import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int position =0;
        int hNumber = 0;
        int n = 100;

        for(int i=0; i<=n;i++){
            int x = rand.nextInt(1000);
            System.out.println(x);

            if(hNumber>=x){
                hNumber=hNumber;
                position=position;
            } else{
                hNumber=x;
                position=i;
            }

        }
        System.out.println("highest "+hNumber);
        System.out.println("position "+position);

    }
}
