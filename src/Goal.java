/**
 * A "Goal" is a single row of spaces that the players are attempting to fill in, from left to right.
 */
public class Goal
{
    // I suggest that you have variables to keep track of which number goal this is, what the reward is, a list of dice
    //   numbers to match, and a list of booleans indicating whether there are dice on them.
    // As with Crazy 8s, a method to decide whether a given die is legal to add to this row would be handy, as would be
    //   method that actually does so...

    // this might be handy:
    private final String[] spaceNames = {"a","b","c","d","e","f"}; // even if you don't use all of them.

    // ---------------------------------
    // TODO: decide what private member variables you wish to have. (See suggestion above.)

    // ---------------------------------

    public Goal(int rowNum, int reward, int[] numsToMatch)
    {
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
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
    public boolean isLegalMove(int dieToConsider)
    {
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
        return false; // temporary code -- replace this.
    }


    /**
     * adds this die to the row of dice placed. Assumes that the move is a legal one, or will throw an exception.
     * @param dieToPlay - the die to add to the row.
     */
    public void makeMove(int dieToPlay)
    {
        if (! isLegalMove(dieToPlay))
        {
            throw new RuntimeException("You attempted to play an illegal move on this row - you should have checked it first: "+dieToPlay);
        }

        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
    }

}
