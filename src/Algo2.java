import java.util.ArrayList;
import java.util.List;

public class Algo2 {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int seqCount = 0;
        for (int i: array) {
            if(seqCount < sequence.size() && i == sequence.get(seqCount)){
                seqCount++;
            }
        }
        if(seqCount == sequence.size())
            return true;
        return false;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);
        System.out.println(isValidSubsequence(array, sequence));
    }
}
