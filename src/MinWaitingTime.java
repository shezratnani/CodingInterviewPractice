import java.util.Arrays;

public class MinWaitingTime {
    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int waitTime = 0;
        for (int i = 0; i < queries.length; i++){
            int queriesLeft = queries.length - (i+1);
            waitTime += queries[i] * queriesLeft;
        }
        return waitTime;
    }

    public static void main(String[] args) {
        int[] input = {3,2,1,2,6};
        System.out.println(minimumWaitingTime(input));
    }

}
