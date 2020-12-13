public class MathUtils {

    public static int slowGcd(int a, int b) {
        if(a==0 && b==0){
           throw new IllegalArgumentException("GCD(0, 0) is not defined");
        }
        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b==0){
            return Math.max(a, b);
        }

        int d = Math.min(a, b);
        while(a%d!=0 || b%d!=0){
            d--;
        }
        return d;
    }
    public static int fastGcd(
            int a, int b) {
        if(a==0 && b==0){
            throw new IllegalArgumentException("GCD(0, 0) is not defined");
        }
        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
