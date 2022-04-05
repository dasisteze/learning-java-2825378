import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        String question = "What is the largest planet in solar system?";
        String choiceOne = "earth";
        String choiceTwo = "saturn";
        String choiceThree = "jupiter";

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
        if (choiceThree.equals(userInput.toLowerCase())) {
            System.out.println("Congratulations! That is the correct answer!");
        } else {
            System.out.println("You are incorrect. The correct answer is " + choiceThree);
        }
    }
}
