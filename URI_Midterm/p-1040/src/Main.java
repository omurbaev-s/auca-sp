import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float n1 = inp.nextFloat();
        float n2 = inp.nextFloat();
        float n3 = inp.nextFloat();
        float n4 = inp.nextFloat();


        float w1 = 2;
        float w2 = 3;
        float w3 = 4;
        float w4 = 1;
        float a;

        float media = (n1*w1+n2*w2+n3*w3+n4*w4)/10;

        if (media>=7) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } if (media<5) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } if (media>=5 && media<=6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            float es= inp.nextFloat();
            a = (media+es)/2;
            if (a>=5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", a);
            } if (a<=4.9) {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", a);
            }
        }

    }
}
