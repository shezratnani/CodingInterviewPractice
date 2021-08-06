import java.util.ArrayList;
import java.util.List;

public class MoveToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int count = 0;
        for (int i: array) {
            if (i != toMove){
                array.set(count++,i);
            }
        }
        for (int i = count; i < array.size(); i++)
            array.set(i, toMove);
        return array;
    }
}
