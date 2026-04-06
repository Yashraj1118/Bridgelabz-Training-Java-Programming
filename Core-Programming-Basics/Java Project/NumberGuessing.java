import java.util.*;
public class NumberGuessing {
    public static void main(String[] args) {
        
        int numberToGuess = (int) (Math.random()*100)+1; 
        int userGuess = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

            int i=1;
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                
                if (userGuess < numberToGuess) {
                    System.out.println("Your guess is smaller than the number, Try again.");
                    System.out.println("Chances remaining: " + (5-i));
                    i++;
                    if(i>5) break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is larger than the number, Try again.");
                    System.out.println("Chances remaining: " + (5-i));
                    i++;
                    if(i>5) break;
                } else {
                    System.out.println("Congratulations! You've guessed the number!");
                }
            }
        if(i>5) {
            System.out.println("Sorry! You've used all your chances. Better luck next time!");
            System.out.println("The original number was " + numberToGuess);
        }
    }
}
        
    
