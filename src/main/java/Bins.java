
public class Bins {
    Integer[] theBins;
    int min;
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

    //returns the number of times int "num" appears in the results
//    public Integer getBin(int num){
//        int counter = 0;
//        for(int i = 0; i < holder.length; i++){
//            if(num == holder[i]){
//                counter++;
//            }
//        }
//
//        return counter;
//    }
}
