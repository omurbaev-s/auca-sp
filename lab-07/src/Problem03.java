import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N: ");
        int n = inp.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++) {
            System.out.printf("Enter %d element: ", i);
            a[i] = inp.nextInt();
        }
            printArray("Before reversing: ", a);
            reverse(a);
            printArray("After reversing: ", a);

        }
        private static void printArray(String msg, int[] a){
            System.out.println(msg);
        for(int e:a){
            System.out.print(e+" ");
        }
            System.out.println();
    }
    static void reverse(int[] a){
        for(int i=0, j=a.length-1; i<j; i++, j--){
            int t = a[i];
            a[i]=a[j];
            a[j]=t;

        }
    }
}
