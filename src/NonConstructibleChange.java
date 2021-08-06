import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        int minChange = 0;
        // Write your code here.
        Arrays.sort(coins);
        for (int i: coins) {
            if(i <= minChange +1)
                minChange += i;
        }
        return minChange+1;
    }
}
