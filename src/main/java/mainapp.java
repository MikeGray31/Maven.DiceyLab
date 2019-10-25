public class mainapp {

    public static void main(String[] args){


        Simulation simulation = new Simulation(3, 100000);


        simulation.runSimulation();

        simulation.printResults();
    }
}
