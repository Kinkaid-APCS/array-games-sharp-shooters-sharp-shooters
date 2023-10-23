public class Row {

    public int points;

    public int face;

    public String type;

    public int howFilled;

    public Boolean filled = false;

    public String spec;

    public Row(){

    int typeChance = (int)(Math.random() * 100);

    if (typeChance < 60){

        type = ""

    }

    }




}
