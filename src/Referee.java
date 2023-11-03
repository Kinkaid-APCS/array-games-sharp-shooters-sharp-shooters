import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Referee
{
    public int boardsUsed = 0;
    public Board board;
    private int diePerPlayer;
    public int diePlacement;
    public int rowPlacement;
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
        board = new Board();
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
        //adding num of players to the player array
        for (int z = 0; z < numPlayers; z++)
        {
            players[z] = new Player(diePerPlayer);
        }
        for (int r = 0; r < numPlayers; r++){
            players[r].dice.resetDice();
        }
        //playing until 6 boards are cleared
        while (canPlay){
            // displays points and dice for each player
            for (int i=0; i < numPlayers; i++) {
                for (int j = 0; j <numPlayers; j++) {
                    System.out.println("Player " + (j+1) + " points equal: " + players[j].points);
                    System.out.println("Player " + (j+1) + " has " + players[j].numOfDie + " dice");
                }

                board.printBoard();
                players[i].rollDie();
                //checks if there are any legal moves at all
                if (!anyLegalMoves(i)) {

                    System.out.println("You have no legal moves");
                    continue;
                }
                else{

                    boolean possibleMatch = false;
                    //Does the die chosen later match the row chosen later
                    while (!possibleMatch) {
                        boolean possibleDie = false;
                        // did the player pick a die within the array of 5 dice
                        while (!possibleDie) {
                            System.out.println("Player " + (i+1) + ", which dice would you like to place");
                            diePlacement = keyReader.nextInt();
                            if (diePlacement <= players[i].dice.myDice.length && diePlacement + 1> 0) {

                                possibleDie = true;
                            } else {
                                System.out.println("That isn't possible dummy, try again");

                            }
                        }
                        // did the player pick a row that is filled or outside of the 6 given
                        boolean possibleRow = false;
                        while (!possibleRow) {
                            System.out.println("Player " + (i+1) + ", which row would you like to put it in");
                            rowPlacement = keyReader.nextInt();
                            if (rowPlacement <= board.rows.length && rowPlacement > 0 && !board.rows[rowPlacement-1].isFull) {

                                possibleRow = true;
                            } else {
                                System.out.println("That isn't possible dummy, try again");

                            }

                        }
                        //checks if row spot matches die number chosen
                        if (board.rows[rowPlacement -1].face[board.rows[rowPlacement-1].howFilled] == players[i].dice.myDice[diePlacement-1]){
                            //changes/possible changes made after placement
                            possibleMatch = true;
                            board.rows[rowPlacement-1].howFilled += 1;
                            players[i].numOfDie -= 1;
                            players[i].dice.myDice[diePlacement-1] = 0;
                            //adding points to player
                            if (board.rows[rowPlacement-1].howFilled == board.rows[rowPlacement-1].length){
                                players[i].points += board.rows[rowPlacement-1].points;
                                board.rows[rowPlacement-1].isFull = true;

                            }
                            System.out.println("placed success");
                            //resetting things if board is full
                            if (board.boardFull()){
                                board.resetBoard();
                                for (int y = 0; y < numPlayers; y++){

                                    players[y].numOfDie = diePerPlayer;
                                }
                                boardsUsed += 1;
                                if (boardsUsed == 6){
                                    canPlay = false;
                                    System.out.println(" That was the final board");
                                    System.out.println(" And the winner is.....");


                                }
                                i = 0;
                                continue;

                            }
                            //reprinting any edits

                            board.printBoard();
                            System.out.println("Would you like to pass or play");
                            String playAgain = keyReader.next();
                            if (Objects.equals(playAgain, "play")){

                                i -= 1;
                            }
                            else{
                                players[i].dice.resetDice();
                            }
                        }
                        else{

                            System.out.println("that match doesn't work, try again");
                        }
                    }
                    }
                }
            }
        }







        // ---------------------------------



    private boolean anyLegalMoves(int j){

        for (int i=0; i < players[j].dice.myDice.length; i++) {
            for (int k = 0; k < 6; k++) {
                if (players[j].dice.myDice[i] == board.rows[k].face[board.rows[k].howFilled]){

                    return true;
                }
            }
        }
        return false;

    }

}
