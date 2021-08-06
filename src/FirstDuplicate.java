import java.util.HashSet;

public class FirstDuplicate {

    public int firstDuplicateValue(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        // Write your code here.
        return -1;
    }
}
