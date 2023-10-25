import java.util.Objects;

public class Row {

    public int points;

    public int face;

    public int length;

    public String type;

    public int howFilled;

    public Boolean filled = false;

    public String spec;

    public Boolean ofAKind = false;

    public Row(){

        int typeChance = (int)(Math.random() * 100);
        int specChance = (int)(Math.random() * 100);

        if (typeChance < 75){

            face = (int)(Math.random() * 6 + 1);
            length = (int)(Math.random()* 6 + 1);

            type = length + " of a kind";
            points = length * 10;
            ofAKind = true;

        }
        else if (typeChance < 80){

            type = "small straight";
            points = 50;

        }
        else if (typeChance < 85) {

            type = "large straight";
            points = 70;

        }
        else if (typeChance < 90){

            type = "super straight";
            points = 90;
        }
        else{

            type = "full house";
            points = 80;

        }
        if (specChance < 10 && !type.equals("super straight") && !type.equals("large straight") && !type.equals("small straight")){

            spec = "star";

        }
        else if (specChance < 25){

            spec = "negative";
            points *= -1;

        }
        if (Objects.equals(spec, "star") && ofAKind) {

            length = (int) (Math.random() * 4 + 3);
            face = 0;
            points = 20 * length - 20;
            type = length + " of a kind";

        }

    }

    public Boolean isFull(){

        if (howFilled == length){

            return true;
        }
        else {
            return false;
        }
    }


}
