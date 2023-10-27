public class DieCollection {
    public int[] myDice; // this will be my five dice. If I set one to zero, then that means it is "used."


    public DieCollection() {
        myDice = new int[5];
    }

    //added

    public void useDie(int which) {
        myDice[which] = 0;
    }

    public boolean useDieWithValue(int value) {
        for (int i = 0;i < 5; i++){
            if (myDice[i] == value) {
                useDie(i);
                return true;
            }
        }
        return false;
    }

    public boolean hasDiceLeft() {
        for (int d : myDice) {
            if (d > 0) {
                return true;
            }
        }
        return false;
    }



    public void randomizeAllDice(int numOfDie) {
        if (numOfDie < 5) {
            for (int i = 0; i < numOfDie; i++) {
                if (myDice[i] > 0) {
                    myDice[i] = (int) (Math.random() * 6) + 1;

                }
            }
        }
        else{
            for (int i = 0; i < 5; i++) {
                if (myDice[i] > 0) {
                    myDice[i] = (int) (Math.random() * 6) + 1;


                }
            }
        }
        for (int j : myDice) {
            System.out.println(myDice[j]); //prints out dice values
        }
    }

    //function for re roll of leftover dice if player chooses to roll instead of pass
    //check through mydice array, if it equals 0 then don't re roll, else other integer then re roll


    //pause
    //little confused (i think i have to count dice)
    //reset dice

    public void resetDice(){
        for (int i = 0; i < 5; i++){
            myDice[i] = 0;
        }


    }


    /**
     * sets the given die to be "used" (i.e., 0).
     * @param which - the index of the die to set to used.
     */


    /**
     * checks for the first die that has the same reading as the given value. If found, "uses" up that die and returns true.
     * If no matching dice are found, returns false.
     * @param value - the die value to search for.
     * @return - whether we found (and used) the given value on one die.
     */


    /**
     * rolls only those dice in myDice that aren't already zero.
     */


}
