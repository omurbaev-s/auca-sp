import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = inp.nextInt();

        int [] scores = new int[n];
        System.out.print("Enter "+n+" scores: ");

        for(int i=0; i<scores.length; i++){
            scores[i]= inp.nextInt();
        }
        int max = bestScore(scores);
        for(int i=0; i<scores.length; i++){
            if(scores[i]>=max-10){
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is A");
            } else if(scores[i]>=max-20){
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is B");
            } else if(scores[i]>=max-30){
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is C");
            } else if(scores[i]>=max-40){
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is D");
            } else{
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is F");
            }
        }
        }

    public static int bestScore(int[] grades){
        int max=grades[0];
        for(int i=1; i< grades.length; i++){
         if(max<grades[i]){
             max=grades[i];
         }
        }
        return max;
    }
}
