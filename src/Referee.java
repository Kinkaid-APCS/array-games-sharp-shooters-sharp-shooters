import java.util.Objects;
import java.util.Scanner;
public class Referee
{

    private Board theBoard;
    private DieCollection dice;
    private Player player1;
    private Player player2;

    private int diePerPlayer;
    // ---------------------------------
    // TODO: decide what private variables the Referee needs.
    private boolean canPlay;
    private Scanner keyReader;
    public Player[] players;

    private long numPlayers;
    // ---------------------------------


    public Referee()
    {


        // ---------------------------------
        // TODO: decide what the Referee needs in terms of initial setup.

        // ---------------------------------
    }

    public void playGame()
    {
        // ---------------------------------
        // TODO: You write this!
        // I strongly recommend that you break this up into smaller methods.
        System.out.println("Welcome to SharpShooters!");
        System.out.println(" ");
        System.out.println("How many players are gonna play?");
        keyReader = new Scanner(System.in);


        while (!canPlay)
        {
            numPlayers = keyReader.nextInt();
            if (numPlayers <= 6 && numPlayers >= 2)
            {
                System.out.println("Your game will have " + numPlayers + " Players");
                canPlay = true;
            }
            else
            {
                System.out.println("You cannot have " + numPlayers + " Players!");
                canPlay = false;
            }
        }
        diePerPlayer = (int)(Math.floor(32/numPlayers));
        for (int z = 0; z <= numPlayers; z++)
        {
            players[z] = new Player(diePerPlayer);
        }







        // ---------------------------------
    }


}
