import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] N = new int[20];
        for(int i=0; i< N.length; i++){
            N[i]=inp.nextInt();
        }
        reverse(N);
        for(int i=0; i< N.length; i++){
            System.out.print(N[i]+" ");
        }
    }
    public static void reverse(int[] a){
        int last = a.length-1;
        for(int i=0; i< a.length; i++){
            int temp = a[i];
            a[i]=a[last];
            a[last]=temp;
            last--;
        }
    }
}
