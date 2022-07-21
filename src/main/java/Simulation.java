public class Simulation {

    Dice dice;
    Bins bins;
    int min;
    int max;
    int numberOfTosses;
    int numberOfDice;

    public Simulation(int numberOfDice, int numberOfTosses){
        dice = new Dice(numberOfDice);
        min = numberOfDice;
        max = numberOfDice*6;
        bins = new Bins(min, max);
        this.numberOfTosses=numberOfTosses;
        this.numberOfDice=numberOfDice;

    }

    public void runSimulation(){
        for(int i = 0; i<numberOfTosses; i++){
            bins.incrementBin(dice.tossAndSum());
        }
        printResults();
    }

    public void printResults(){
        int total = 0;
        double percent;
        String stars = "";
        System.out.println("***\n" +
                "Simulation of "+numberOfDice+" dice tossed for "+numberOfTosses+" times.\n"+
                "***");
        for (int i = min; i<=max; i++){
            total = bins.getBin(i);
            percent = (double)total/numberOfTosses;
            for(int j = 0; j<Math.round(percent*100); j++){
                stars += "*";
            }

            System.out.println(i+" :    "+total+": "+percent+" "+stars);
            stars = "";
        }
    }


}
