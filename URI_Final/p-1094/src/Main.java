import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 0;
        int c;
        int total =0;
        int totalC = 0, totalR = 0, totalS=0;
        float totalCp=0, totalRp=0, totalSp=0;
        String aType;

        while(i<n){
            c = inp.nextInt();
            aType = inp.next();
            total +=c;
            i++;

            if(aType.equals("C")){
                totalC+=c;
            } else if(aType.equals("R")){
                totalR+=c;
            } else if(aType.equals("S")){
                totalS+=c;
            }

            totalCp=(float)((totalC * 100.00) /total);
            totalRp=(float)((totalR * 100.00) /total);
            totalSp=(float)((totalS * 100.00) /total);


        }
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+totalC);
        System.out.println("Total de ratos: "+totalR);
        System.out.println("Total de sapos: "+totalS);

        System.out.printf("Percentual de coelhos: %.2f%n",totalCp);
        System.out.printf("Percentual de ratos: %.2f%n",totalRp);
        System.out.printf("Percentual de sapos: %.2f%n",totalSp);

    }
}
