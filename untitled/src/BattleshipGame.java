
import java.util.Scanner;

public class BattleshipGame {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();

        Scanner scanner = new Scanner(System.in);

        while(!battleship.isSunk()) {
            System.out.print("Enter guess: ");
            String guess = scanner.nextLine();

            if(battleship.hit(guess)) {
                System.out.println("Hit!");
            } else {
                System.out.println("Miss!");
            }
        }

        System.out.println("Battleship sunk! You win.");

        scanner.close();
    }

}