import java.util.Arrays;

public class SharpShooterRunner
{
    public static void main(String[] args)
    {
        boolean testingMode = true;
        Row row1 = new Row();
        if (testingMode)
        {
            System.out.println("Start tests");
            // enter test code here.
            System.out.println(row1.type);
            System.out.println(row1.spec);
            System.out.println(row1.points);
            System.out.println(Arrays.toString(row1.face));
            System.out.println("End tests");
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
