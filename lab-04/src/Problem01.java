public class Problem01 {
    public static void main(String[] args) {
        double s = 0;
        double d = 0.1;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
        s+=d;
         if (Math.abs(s - 1.0)<1e-10) {
             System.out.println("Ok");
         } else {
             System.out.println("!!!");
         }
    }
}
