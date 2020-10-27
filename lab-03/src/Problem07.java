import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = inp.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = inp.nextInt();

        int futureDay = (today+elapsed)%7;

        System.out.print("Today is ");
        switch (today) {
            case 0: System.out.print("Sunday");break;
            case 1: System.out.print("Monday");break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday");break;
            case 4: System.out.print("Thursday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
        }
        System.out.print(" and the future day is ");
        switch (futureDay) {
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
        }

        }
    }
