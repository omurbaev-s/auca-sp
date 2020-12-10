public class Main {
    public static void main(String[] args) {
        double s = 0;
        for(int i =1; i<=100; i++){
            s+=(double)1/i;
        }
        System.out.printf("%.2f%n",s);
    }
}
