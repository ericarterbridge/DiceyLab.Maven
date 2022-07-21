import java.util.LinkedHashMap;
import java.util.Map;

public class Bins {
    public int minSum;
    public int maxSum;
    //public int[] bins;
    Map<Integer, Integer> bins;

    public Bins(int minSum, int maxSum){
        this.minSum = minSum;
        this.maxSum = maxSum;
        bins = new LinkedHashMap<>();
        for (int i = minSum; i<= maxSum; i++){
            bins.put(i,0);
        }
    }

    public int getBin(int binNumber){
        return bins.get(binNumber);
    }

    public void incrementBin(int binNumber){
        Integer count = bins.get(binNumber);
        bins.put(binNumber, count+1);
    }
}
