
/**
 *
 * A Board is a collection of 5-6 Goals, each of which represents a row of spaces.
 */



public class Board //TESTING COMMIT AND PUSH
{

    public Row[] rows = new Row[6];


    public Board()
    {
        // ---------------------------------
        //  TODO: set up the Goals
        for (int z = 0; z < 6; z++)
        {
            rows[z] = new Row();
        }


        // ---------------------------------

    }

    public void printBoard()
    {

        // ---------------------------------
        // TODO: modify result so that it shows all the goals.



        System.out.println("current board");

        for (int i=0;i < 6; i++) {
            System.out.print("Row " + (i+1) +  " : ");
            for (int z = 0; z < rows[i].howFilled; z++)
            {
                System.out.print("X" + "\t");
            }
            for (int x = rows[i].length - rows[i].howFilled; x > 0; x--) //
            {
                System.out.print("_" + "\t");
            }
            System.out.print("\t" + "\t" + "\t" + "Reward: " + rows[i].points);
            System.out.println(" ");
            System.out.print("\t" + "\t");

            for (int j = 0; j < rows[i].length; j++)
            {
                if (rows[i].face[j] == -1)
                {
                    System.out.print("*" + "\t");
                }
                else
                {
                    System.out.print(rows[i].face[j] + "\t");
                }

            }

            System.out.println(" ");
            System.out.println(" ");
        }
        // ---------------------------------


    }

    public void resetBoard(){
        for (int z = 0; z < 6; z++)
        {
            rows[z] = new Row();
        }
    }

    public boolean boardFull(){
        for (int i = 0; i < 6; i++){
            if (!rows[i].isFull){
                return false;
            }

        }
        return true;

    }



}
