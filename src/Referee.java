public class Referee
{

    private Board theBoard;
    private DieCollection dice;
    private Player player1;
    private Player player2;
    // ---------------------------------
    // TODO: decide what private variables the Referee needs.

    // ---------------------------------


    public Referee()
    {
        int diePerPlayer = 32/2;
        theBoard = new Board();
        dice = new DieCollection();
        player1 = new Player(diePerPlayer);
        player2 = new Player(diePerPlayer);
        // ---------------------------------
        // TODO: decide what the Referee needs in terms of initial setup.

        // ---------------------------------
    }

    public void playGame()
    {
        // ---------------------------------
        // TODO: You write this!
        // I strongly recommend that you break this up into smaller methods.

        // ---------------------------------
    }


}
