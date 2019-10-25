public class Dice {

    //declare empty int for number of dice
    int dice;

    //constructor passes an int for number of dice
    public Dice(int numberOfDice){
        dice = numberOfDice;
    }

    //finds the sum for n number of dice rolls
    public int Sum(){
        int result = 0;

        for(int i = 0; i < dice ;i++){
            result += this.toss(); // change to variables later
        }
        return result;
    }

    public int toss(){
        int tossresult = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        return tossresult;
    }


}
