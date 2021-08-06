import java.util.ArrayList;
import java.util.List;

public class FourNumberSum {


    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> finalList = new ArrayList<Integer[]>();
        for(int i =0;i<array.length;i++){
            Integer[] response = addsUp(array, i -1, targetSum, 4);
            if(response != null)
                finalList.add(response);
        }
        return finalList;
    }

    public static Integer[] addsUp(int[] array, int max, int targetSum, int numOfInts){
        for (int i = 0; i < max; i++) {
         int newTarget = targetSum - array[i];
            return addsUp(array, max - 1, newTarget, numOfInts - 1);
        }
        return null;
    }
}
