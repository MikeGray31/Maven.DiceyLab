
public class Bins {
    private Integer[] theBins;
    private int min;
    //constructor
    public Bins(int minimum, int maximum){
        min = minimum;
        theBins = new Integer[(maximum - minimum) + 1];

        for(int i = 0; i < theBins.length; i++){
            theBins[i] = 0;
        }
    }

    public void incrementBin(int sum){
        theBins[sum - min] = theBins[sum - min] + 1;
    }

    public Integer getBin(int numWeWant){
        return theBins[numWeWant - min];
    }
}
