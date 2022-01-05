import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        Arrays.sort(array);

        Integer leftPointer = 0;
        Integer rightPointer = array.length-1;
        while(leftPointer != rightPointer){
            int sum = array[leftPointer] + array[rightPointer];
            if(sum < targetSum){
                leftPointer++;
            }else if(sum > targetSum){
                rightPointer--;
            }else{
                return new int[]{array[leftPointer], array[rightPointer]};
            }
        }
        return new int[0];

    /* time complexity: O(n)
        space complexity: O(n)
        HashSet<Integer> iterated = new HashSet<Integer>();

        for(int i: array){
            if(iterated.contains(targetSum - i)){
                return new int[]{targetSum - i, i};
            }else{
                iterated.add(i);
            }

        }

        return new int[0];*/

        /*bruteforce solution takes O(n^2) time O(1) space
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < i; j++){
                if(array[i] + array[j] == targetSum){
                    return new int[]{array[i], array[j]};
                }
            }
        }
            return new int[0];
        */
    }
}
