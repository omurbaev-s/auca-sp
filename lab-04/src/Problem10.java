public class Problem10 {
    public static void main(String[] args) {
        int rank = (int) (Math.random()*13);

        System.out.print("The card you picked is ");
        switch (rank) {
            case 0: System.out.print("ACE");break;
            case 1: System.out.print("2");break;
            case 2: System.out.print("3");break;
            case 3: System.out.print("4");break;
            case 4: System.out.print("5");break;
            case 5: System.out.print("6");break;
            case 6: System.out.print("7");break;
            case 7: System.out.print("8");break;
            case 8: System.out.print("9");break;
            case 9: System.out.print("10");break;
            case 10: System.out.print("Jack");break;
            case 11: System.out.print("Queen");break;
            case 12: System.out.print("King");
        }
        int suit = (int) (Math.random()*4);
        System.out.print(" of ");
        switch (suit) {
            case 0: System.out.println("Clubs");break;
            case 1: System.out.println("Diamonds");break;
            case 2: System.out.println("Hearts");break;
            case 3: System.out.println("Spades");
        }

    }
}
