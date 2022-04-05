import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        String question = "What is 10 divided by 2?";
        String choiceOne = "3";
        String choiceTwo = "5";
        String choiceThree = "Invalid, not divisible";

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println(choiceOne + "\n" + choiceTwo + "\n" + choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        System.out.println("Please enter your answer: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        // If the user's input matches the correctAnswer...
        // then the user is correct, and we want to print out a congrats message to the user
        if (userInput.equals(choiceTwo)) {
            System.out.println("Congratulations! That is the correct answer!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect, and we want to print out a message saying the user is incorrect
        else {
            System.out.println("Sorry! That answer (" + userInput + ") is not correct.");
        }
    }
}
