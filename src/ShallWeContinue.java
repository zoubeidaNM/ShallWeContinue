import java.util.Scanner;

public class ShallWeContinue {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        String answer = "";

        do {

            System.out.print("Do you want to continue?");
            // get the answer from the user
            answer = keyboard.next();
            //if it is an anvalid answer
            if ((answer.equalsIgnoreCase("y") == false) && (answer.equalsIgnoreCase("n") == false)){
                System.out.print("Invalid option.");
            }
            //return to a new line
            keyboard.nextLine();
            System.out.println("");

        }while ((answer.equalsIgnoreCase("n")) == false);

        System.out.println("Thank you!");

    }
}
