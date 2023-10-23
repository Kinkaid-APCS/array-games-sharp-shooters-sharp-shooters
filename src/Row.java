public class Row {

    public int points;

    public int face;

    public int length;

    public String type;

    public int howFilled;

    public Boolean filled = false;

    public String spec;

    public Row(){

    int typeChance = (int)(Math.random() * 100);

    if (typeChance < 59){

        face = (int)(Math.random() * 6 + 1);
        length = (int)(Math.random()* 6 + 1);

        type = length + " of a kind";

    }

    }




}
