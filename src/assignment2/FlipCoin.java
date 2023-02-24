package assignment2;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        //TODO Delete line below, and implement this method
        if (Math.random() < 0.5){
            return 0;
        } else {
            return 1;
        }
    }
}
