public class Main {
    public static void main(String[] args) {

        for (int i = 1, j=7; i <= 9; i += 2, j+=2) {

            for (int I = i,J = j; (J >= j-2); J-=1) {

                System.out.println("I="+I+ " J="+J);
            }
        }
    }
}
