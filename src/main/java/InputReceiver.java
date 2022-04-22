import java.util.Scanner;

public class InputReceiver {

    private final String invalidErrorMessage = "Invalid choice, please try again";

    //Verify that the user's input is indeed 1\2 and not other invalid input and returns the user's choice
    public int chooseOption() {

        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");

        int intChoice = 0;

        while (intChoice != 1 && intChoice != 2) {

            Scanner scan = new Scanner(System.in);
            String choice = scan.next();

            if (choice.equals("1")) {
                intChoice = 1;
            } else if (choice.equals("2")) {
                intChoice = 2;
            } else {
                System.out.println(invalidErrorMessage);
            }
        }
        return intChoice;
    }

//Verify that the amount typed is a valid number and not a negative number or other invalid characters and returns
// the amount
    public double amountInput() {
        System.out.println("Please enter an amount to convert");
        double amount;

        while (true) {

            try {
                Scanner scan = new Scanner(System.in);
                amount = scan.nextDouble();
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println(invalidErrorMessage);
                }

            } catch (Exception e) {
                System.out.println(invalidErrorMessage);
            }
        }

    }
// Receives the user's choice whether to restart the program or not
    public boolean doOver() {

        System.out.println("Do you want to start over? (Y/N):");

        while (true) {
            Scanner scan = new Scanner(System.in);
            String userChoice = scan.next();

            if (userChoice.equalsIgnoreCase("y")) {
                return true;
            } else if (userChoice.equalsIgnoreCase("n")) {
                return false;
            }
                System.out.println(invalidErrorMessage);
        }
    }
}
