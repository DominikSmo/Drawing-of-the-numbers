import java.util.Random;
import java.util.Scanner;

public class drawingOftheNumbers {
    public static void main(String[] args) {

        drawNumbers();
    }

    public static void drawNumbers() {
        //Create a program which draws numbers from '"0'" to "10".
        //User have to choose a correct number. Program counts the numbers of the attempts.


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber;                                                           // Is drawn by a computer
        int choosenNumber;                                                          // Number chosen by User
        int count = 0;                                                              // Counter of the attempts

        do {
            System.out.print("Input a number:");
            randomNumber = random.nextInt(11);                              // Random integer numbers from "0" to "10"
            choosenNumber = scanner.nextInt();
            count = count + 1;                                                      //Counter
            System.out.println("The number of attempts is:" + count);               // Displaying of a counter

            if (randomNumber == choosenNumber) {                                     // What's happening when User will choose a correct number
                System.out.println("You won!");
                System.out.println("The end of the game");
                System.exit(0);                                                 //Ending of a program

            }else {                                                                     //What's happening when User doesn't choose a correct number
                System.out.println("You missed!");
                System.out.println("A drawn number is:" + randomNumber);
                System.out.println("Try again...");
            }

        }while (randomNumber != choosenNumber); {
        }
        drawNumbers();
    }
    }





