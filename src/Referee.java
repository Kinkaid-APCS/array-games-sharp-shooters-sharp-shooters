import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Referee
{

    private Board theBoard;
    public Player player1;
    private Player player2;

    public Row row1;

    private int diePerPlayer;
    // ---------------------------------
    // TODO: decide what private variables the Referee needs.
    private boolean canPlay;
    private Scanner keyReader;
    public Player[] players = new Player[6];

    private long numPlayers;
    // ---------------------------------


    public Referee()
    {


        // ---------------------------------
        // TODO: decide what the Referee needs in terms of initial setup.
        row1 = new Row();
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
        for (int z = 0; z < numPlayers; z++)
        {
            players[z] = new Player(diePerPlayer);
        }
        while (canPlay){
            for (int i=0; i < numPlayers; i++) {
                for (int j = 0; j <numPlayers; i++) {
                    System.out.println("Player " + j + " points equal: " + players[j].points);
                }

                System.out.println("BoardHolder");
                players[i].rollDie();
                System.out.println(Arrays.toString(players[i].dice.myDice));
                if (!anyLegalMoves(i)){

                    System.out.println("You have no legal moves");
                    continue;
                }
                else{
                    boolean possibleDie = false;
                    while (!possibleDie) {
                        System.out.println("Player " + i +", which dice would you like to place");
                        int diePlacement = keyReader.nextInt();
                        if (diePlacement + 1 <= players[i].dice.myDice.length && diePlacement + 1 > 0){

                            possibleDie = true;
                        }
                        else{
                            System.out.println("That isn't possible dummy, try again");

                        }
                    }
                    boolean possibleRow = false;
                    while (!possibleRow){
                        System.out.println("Player " + i +", which row would you like to put it in");
                        int diePlacement = keyReader.nextInt();
                        if (diePlacement + 1 <= players[i].dice.myDice.length && diePlacement + 1 > 0){

                            possibleRow = true;
                        }
                        else{
                            System.out.println("That isn't possible dummy, try again");

                        }

                    }
                }
            }
        }







        // ---------------------------------
    }

    private boolean anyLegalMoves(int j){

        for (int i=0; i < players[j].dice.myDice.length; i++){
            if (players[j].dice.myDice[i] == row1.face[0]){

                return true;
            }
        }
        return false;

    }

}
