public class Main {
    public static void main(String[] args) {

        for(double i=0,j=1;i<=2;i+=0.2, j+=0.2){
           for(double I=i, J=j;(J<4);J++){
               System.out.printf("I=%.1f J= %.1f%n",I,J);
           }
        }
    }
}
