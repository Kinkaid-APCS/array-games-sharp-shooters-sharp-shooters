import java.util.Arrays;

public class SharpShooterRunner
{
    public static void main(String[] args)
    {
        boolean testingMode = true;
        Referee reff = new Referee();
        Board board = new Board();
        if (testingMode)
        {
            System.out.println("Start tests");
            // enter test code here.
            board.printBoard();
        }
        else
        {
            Referee ref = new Referee();
            System.out.println("Start game");
            ref.playGame();
            System.out.println("End game");
        }
    }
}
