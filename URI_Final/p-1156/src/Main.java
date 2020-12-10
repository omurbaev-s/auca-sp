public class Main {
    public static void main(String[] args) {
        double s = 0;
        int x =1;
        for(int i =1; i<=39; i+=2){
            s+=(double)i/x;
            x*=2;
        }
        System.out.printf("%.2f%n",s);
    }
}
