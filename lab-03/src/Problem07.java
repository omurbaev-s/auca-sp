import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = inp.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = inp.nextInt();

        double futureDay = today+elapsed;

        if (today==0) {
            System.out.print("Today is Sunday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==1) {
            System.out.print("Today is Monday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==2) {
            System.out.println("Today is Tuesday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==3) {
            System.out.println("Today is Wednesday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==4) {
            System.out.println("Today is Thursday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==5) {
            System.out.println("Today is Friday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        } if (today==6) {
            System.out.println("Today is Saturday ");
            if (futureDay%7==0) {
                System.out.println("and the future day is Sunday");
            } if (futureDay%7==142857143) {
                System.out.println("and the future day is Monday");
            } if (futureDay%7==285714286) {
                System.out.println("and the future day is Tuesday");
            } if (futureDay%7==428671429) {
                System.out.println("and the future day is Wednesday");
            } if (futureDay%7==571428571) {
                System.out.println("and the future day is Thursday");
            } if (futureDay%7==714285714) {
                System.out.println("and the future day is Friday");
            } if (futureDay%7==857142857) {
                System.out.println("and the future day is Saturday");
            }
        }


        }
    }
