public class Simulation {
    //fields and class instances
    private int numDice;
    private int numTosses;
    private Dice dice;
    private Bins results;

    //constructor
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numDice = numberOfDice;
        this.numTosses = numberOfTosses;
        dice = new Dice(numDice);
        results = new Bins(numDice, 6 * numDice);

    }

    public void runSimulation(){
        int sum;
        for(int i = 0; i < numTosses; i++){
            sum = dice.Sum();
            results.incrementBin(sum);
        }
    }

    public void printResults(){
        String s = "*";
        Console.println("***\nSimulation of %d dice tossed for %d times\n***", numDice , numTosses);
        for(int i = numDice; i <= 6 * numDice; i++){
            double percent = results.getBin(i) / (double)numTosses;
            Console.println(String.format("%2d: %7d:  %.2f:   %s", i, results.getBin(i), percent, s.repeat((int) (100 * percent))));
        }
    }


    public void setNumDice(Integer numDice) {
        this.numDice = numDice;
    }

    public void setNumTosses(Integer numTosses) {
        this.numTosses = numTosses;
    }

}
