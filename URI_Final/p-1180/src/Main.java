import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int[] X = new int[N];
        if (N > 1 && N < 1000) {
            for (int i = 0; i < X.length; i++) {
                X[i] = inp.nextInt();
            }
        }
        System.out.println("Menor valor: "+X[getIndexOfMin(X)]);
        System.out.println("Posicao: "+getIndexOfMin(X));
    }
    public static int getIndexOfMin(int[] a) {
        int iMin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[iMin]) {
                iMin = i;
            }
        }
        return iMin;
    }
}
