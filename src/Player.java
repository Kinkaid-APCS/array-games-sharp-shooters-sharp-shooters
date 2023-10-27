import java.util.Arrays;

/**
 * A "Goal" is a single row of spaces that the players are attempting to fill in, from left to right.
 */
public class Player
{
    public int points = 0;
    public int numOfDie;
    public DieCollection dice;



    // this might be handy:
    private final String[] spaceNames = {"a","b","c","d","e","f"}; // even if you don't use all of them.

    // ---------------------------------
    // TODO: decide what private member variables you wish to have. (See suggestion above.)

    // ---------------------------------

    public Player(int diePerPlayer)
    {
        numOfDie = diePerPlayer;

        dice = new DieCollection();
    }

    public void rollDie(){

        if (numOfDie >= 5){
            dice.randomizeAllDice(numOfDie);

        }
        else if(numOfDie > 0){
            numOfDie = 0;
            dice.randomizeAllDice(numOfDie);
        }

    }


    public String toString()
    {
        String result = "";
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
        return result;
    }

    /**
     * Is it ok for the user to place this die next? (DOES NOT actually do the placement)
     * @param dieToConsider
     * @return boolean - whether it is ok to place this die.
     */
    public boolean isLegalMove(int dieToConsider, int facePos)
    {
        return dice.myDice[facePos] == dieToConsider;
    }


    /**
     * adds this die to the row of dice placed. Assumes that the move is a legal one, or will throw an exception.
     * @param dieToPlay - the die to add to the row.
     */
    public int makeMove(int dieToPlay, int facePos)
    {
        if (! isLegalMove(dieToPlay,facePos))
        {
            throw new RuntimeException("You attempted to play an illegal move on this row - you should have checked it first: "+dieToPlay);
        }
        else{

            dice.myDice[dieToPlay] = 0;
            return 0;

        }
    }


}
