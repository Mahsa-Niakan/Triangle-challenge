import java.util.Scanner;

public class Main {

    static Scanner READER = new Scanner(System.in);  // Reading from System.in
    static  boolean STOP=false; // End Condition

    public static void TriangleChallenge(){

 }

    public static void main(String[] args) {
       do {
           Scanner input = null;
           try {
               input = new Scanner(System.in); // Control infinite loop
               int firstSide = getFirstSide(); //First Side of Triangle
               int secondSide = getSecondSide(); //Second Side of Triangle
               int thirdSide = getThirdSide(); // Third Side of Triangle
               System.out.println("First Side Is: " + firstSide + ". Second Side Is: " + secondSide + ". Third Side Is: " + thirdSide);
               Triangle t = new Triangle(firstSide, secondSide, thirdSide);
               System.out.println(t.printTriangleType() + '\n');
               System.out.println("Continue? Enter 1 to continue or any key to exit");
               String contnu = READER.next();
               if (contnu.equals(1)) // End Condition
                   STOP = false;
               else
                   STOP = true; // End Condition
           } catch (Exception ex) {
              System.out.println("An Error Occurred: " + ex); // Show error if something went wrong such as bad input
              READER.next();// Move to next other wise exception

           }

       }
        while (!STOP);
        READER.close();
        System.out.println("GoodBye :)" + '\n'); // Ending Message
    }

    // Get First Side of Triangle
    public static int getFirstSide() {
        System.out.println("Enter First Side Length: ");
        int firstSide = READER.nextInt();

        if (Triangle.sideValueIsValid(firstSide)) {
            return firstSide;
        } else {
            System.out.println("First Side Is Invalid. Please Try Again");
            return getFirstSide();
        }
    }

    // Get Second Side of Triangle
    public static int getSecondSide() {
        System.out.println("Enter Second Side Length: ");
        int secondSide = READER.nextInt();
        if (Triangle.sideValueIsValid(secondSide)) {
            return secondSide;
        } else {
            System.out.println("Second Side Is Invalid. Please Try Again");
            return getSecondSide();
        }
    }

    // Get Third Side of Triangle
    public static int getThirdSide() {
        System.out.println("Enter Third Side Length: ");
        int thirdSide = READER.nextInt();
        if (Triangle.sideValueIsValid(thirdSide)) {
            return thirdSide;
        } else {
            System.out.println("Third Side Is Invalid. Please Try Again");
            return getThirdSide();
        }
    }
}