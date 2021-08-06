import java.util.Arrays;
import java.util.HashSet;

public class PairNumbersSum {
    //[1,2,3,9]
    //[1,2,4,4]
    //sorted

    public static void main(String[] args) {
        int[] input = {1,2,3,9};
        int[] input2 = {1,2,4,4};
        System.out.println(Arrays.toString(findPair(input, 8)));
        System.out.println(Arrays.toString(findPair(input2, 8)));

    }

    public static int[] findPair(int[] input, int target){ //if not sorted
        int[] pair = new int[2];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i: input) {
            int difference = target - i;
            if(set.contains(difference)){
                pair[0] = i;
                pair[1] = difference;
                return pair;
            }else{
                set.add(i);
            }
        }
        return null;
    }

//    public static int[] findPair(int[] input, int target){ //if sorted
//        int[] pair = new int[2];
//        int p1 = 0;
//        int p2 = input.length -1;
//        while(p1 < p2){
//            int num1 = input[p1];
//            int num2 = input[p2];
//           if(num1 + num2 == target){
//               pair[0] = num1;
//               pair[1] = num2;
//               return pair;
//           }else if(num1 + num2 < target){
//               p1++;
//           }else{
//               p2--;
//           }
//        }
//        return null;
//    }
}
