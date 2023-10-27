import java.util.Objects;

public class Row {

    public int points;

    public int[] face = new int[6];

    public int length;

    public String type;

    public int howFilled;

    public String spec;

    public Boolean ofAKind = false;

    public Row(){

        int typeChance = (int)(Math.random() * 100);
        int specChance = (int)(Math.random() * 100);

        if (typeChance < 75){

            int num =(int)(Math.random() * 6 + 1);
            length = (int)(Math.random()* 6 + 1);

            for (int i = 0;i < length; i++){

                face[i] = num;
            }

            type = length + " of a kind";
            points = length * 10;
            ofAKind = true;

        }
        else if (typeChance < 80){

            type = "small straight";
            length = 4;
            points = 50;
            smallStraight();

        }
        else if (typeChance < 85) {

            type = "large straight";
            length = 5;
            points = 70;
            largeStraight();

        }
        else if (typeChance < 90){

            type = "super straight";
            length = 6;
            points = 90;
            superStraight();
        }
        else{

            type = "full house";
            length = 5;
            points = 80;
            fullHouse();

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
            for (int j=0; j<6; j++){
                face[j] = 0;
            }

            for (int i=0; i<length; i++){
                face[i] = -1;
            }

            points = 20 * length - 20;
            type = length + " of a kind";

        }
        if (Objects.equals(spec, "star") && Objects.equals(type, "full house")){

            for (int i=0; i<3; i++){
                face[i] = -1;
            }
            for (int i=3; i<5; i++){
                face[i] = -2;
            }

        }

    }

    public Boolean isFull(){

        return howFilled == length;
    }

    private void smallStraight(){

        int num = (int)(Math.random() * 2 + 1);
        int reverse = (int)(Math.random() * 2 + 1);

        if (reverse == 1){

            for (int i=0; i < length; i++){

                face[i] = num+i;
            }
        }
        else if (reverse == 2){

            for (int i = length-1; i >= 0; i--) {

                face[i] = length-i;

            }

        }
    }
    private void largeStraight() {

        int num = (int) (Math.random() + 1);
        int reverse = (int) (Math.random() + 1);

        if (reverse == 1) {

            for (int i = 0; i < length; i++) {

                face[i] = num + i;
            }
        } else if (reverse == 2) {

            for (int i = length-1; i >= 0; i--) {

                face[i] = 6-i;

            }

        }
    }
    private void superStraight() {

        int reverse = (int) (Math.random() * 2 + 1);

        if (reverse == 1) {

            for (int i = 0; i < length; i++) {

                face[i] = i + 1;
            }
        } else if (reverse == 2) {

            for (int i = length-1; i >= 0; i--) {

                face[i] = 6-i;

            }

        }
    }
    private void fullHouse(){

        int ran = (int) (Math.random() * 6 + 1);
        for (int i=0; i<3; i++){
            face[i] = ran;
        }
        int ran1 = (int) (Math.random() * 6 + 1);
        while (ran1 == ran){

            ran1 = (int) (Math.random() * 6 + 1);

        }
        for (int i=3; i<5; i++){
            face[i] = ran1;
        }

    }


}
