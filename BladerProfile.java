import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This is the main method that holds all the gameplay
 */
//
public class BladerProfile extends Blader {
    private static Scanner scan = new Scanner(System.in);
    private static Beyblade beyblade = new Beyblade();
    private static Beylogger beylogger = new Beylogger();


//game
    public static void main(String[] args) {
        Beyblade curBeyblade;
        String userInput;
        boolean openLocker = false;
        boolean closeLocker = false;

        System.out.println("Welcome Blader to the Beylocker");
        ;
        System.out.println("Would you like to browse the Beylocker" + "\n" + "(Please type yes or no)");
        System.out.println("If you would like to leave, type exit");


        while (!openLocker) {
            userInput = scan.nextLine().toLowerCase().trim();
            switch (userInput) {
                case "yes":
                    openLocker = true;
                    beylogger.printBeyblades();
                    break;

                case "no":
                    openLocker = true;
                    System.out.println("Battle with you later! Come back soon!");
                    break;
                case "skip":
                    openLocker = true;
                    break;
                case "exit":
                    System.out.println("Battle with you later! Come back soon!");
                    break;
                default:
                    System.out.println("Incorrect response, please try again by typing either Yes, No or Skip");
            }

            }

        }

    }
