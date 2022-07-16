
public class Bins {
    public int minSum;
    public int maxSum;
    public int[] bins;

    public Bins(int minSum, int maxSum){
        this.minSum = minSum;
        this.maxSum = maxSum;
        bins = new int[maxSum - minSum + 1];
    }

    public int getBin(int binNumber){
        return bins[binNumber - minSum];
    }

    public void incrementBin(int binNumber){
        bins[binNumber - minSum] += 1;
    }
}
