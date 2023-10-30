import java.util.Arrays;

public class SharpShooterRunner
{
    public static void main(String[] args)
    {
        boolean testingMode = true;
        Referee reff = new Referee();
        if (testingMode)
        {
            System.out.println("Start tests");
            // enter test code here.
            System.out.println(reff.row1.type);
            System.out.println(reff.row1.spec);
            System.out.println(reff.row1.points);
            System.out.println(Arrays.toString(reff.row1.face));
            System.out.println("End tests");
            reff.player1.rollDie();

            reff.player1.dice.rerollUnusedDice();
            reff.player1.dice.rerollUnusedDice();
            reff.player1.dice.rerollUnusedDice();
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
