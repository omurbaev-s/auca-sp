public class Problem10 {
    public static void main(String[] args) {

        final int N_O_P=50;
        final int N_O_P_P_L=10;
        int count = 0;
        int i =2;

        System.out.println("The first 50 prime numbers are ");

        while(count<N_O_P){
            boolean isPrime = true;
            for(int divisor = 2; divisor<=i/2; divisor++){
                if(i%divisor==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
                if(count%N_O_P_P_L==0){
                    System.out.println(i);
                } else{
                    System.out.print(i+" ");
                }
            }
            i++;
        }

    }
}
