import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] numbers=new int[100];
        int[] sum=new int[100];
        for (int i=0; i< numbers.length; i++) {
            numbers[i] = inp.nextInt();
            if(numbers[i]==0){
                break;
            }
        }
        for (int i=0; i< numbers.length; i++){
            int temp =numbers[i];
            sum[temp]++;
        }
        for(int i=1; i< sum.length; i++){
            if(sum[i]>0 || sum[i]==1){
                System.out.println(i+" occurs "+sum[i]+" time");
            } else if( sum[i]>=2){
                System.out.println(i+" occurs "+sum[i]+" times");
            }
        }
    }
}
