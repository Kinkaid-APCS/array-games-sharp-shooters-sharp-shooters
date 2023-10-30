
/**
 *
 * A Board is a collection of 5-6 Goals, each of which represents a row of spaces.
 */



public class Board //TESTING COMMIT AND PUSH
{

    public Row[] board;
    public Board()
    {
        // ---------------------------------
        //  TODO: set up the Goals



        // ---------------------------------

    }

    public void printBoard()
    {

        // ---------------------------------
        // TODO: modify result so that it shows all the goals.

        for (int z = 0; z < 6; z++)
        {
            Row row = new Row();
        }

        System.out.println("current board");
        System.out.print("Row 1 : ");
        for (int z = 0; z < 1; z++) // 1 = how filled
        {
            System.out.print(" X ");
        }
        for (int x = 6-1; x > 1; x--) // 1 = how filled
        {
            System.out.print(" _ ");
        }
        System.out.print("                       Reward" + );
        // ---------------------------------


    }



}
