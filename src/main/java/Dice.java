public class Dice {

    public int dice;
    public int total;

    public Dice(int dice) {
        this.dice = dice;
    }

    public Integer tossAndSum() {

    this.total = 0;
    int randomNumber;

    for (int i = 0; i < dice; i++){
        randomNumber = (int) (Math.random() * 6 +1);
        total = total + randomNumber;

    }
    return total;
    }


}
