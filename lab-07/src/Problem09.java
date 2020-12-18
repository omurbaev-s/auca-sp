import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] numbers = new double[10];
        for(int i=0; i< numbers.length; i++){
            numbers[i]= inp.nextDouble();
        }
        System.out.println(indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        return iMin;
    }
}
