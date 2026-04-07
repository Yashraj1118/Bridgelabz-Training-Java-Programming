import java.util.*;
public class SnakeLadder {
    static int getNewPosition(int position) {
        
        //For snake cases
        if (position == 99) return 54;
        if (position == 70) return 55;
        if (position == 52) return 42;
        if (position == 25) return 2;
        
        //For ladder cases
        if (position == 6) return 25;
        if (position == 11) return 40;
        if (position == 60) return 85;
        if (position == 46) return 90;

        return position;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int player1 = 0, player2 = 0;
        boolean isPlayer1Turn = true;

        while (player1 < 100 && player2 < 100) {
            System.out.println("\nPress Enter to roll dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("Dice: " + dice);

            if (isPlayer1Turn) {
                if (player1 + dice <= 100) {
                    player1 += dice;
                    player1 = getNewPosition(player1);
                }
                System.out.println("Player 1 Position: " + player1);
            } else {
                if (player2 + dice <= 100) {
                    player2 += dice;
                    player2 = getNewPosition(player2);
                }
                System.out.println("Player 2 Position: " + player2);
            }

            isPlayer1Turn = !isPlayer1Turn;
        }

        if (player1 == 100) {
            System.out.println(" Player 1 Wins!");
        } else {
            System.out.println(" Player 2 Wins!");
        }

        sc.close();
    }
}