/**/

import java.util.Arrays;

public class ThreeSumZero {
    public static void main(String[] args) {
        int[] result = threeSumZero(new int[]{0, -1, 1, -2, 2});
        for (int i : result)
            System.out.print(i + ", ");
    }

    /*[3, 5, 8, 10, -9, -11, 16, 2] => [3, 8, -11]
    * [3, 5, 4, 9, -16, -10] => []
    * [0, 3, 4, 8, -1, -3] => [0, 3, -3] or [-1, -3, 4]
    * [0, -1, 1, -2, 2] => [0, 1, -1] or [0, -2, 2]
    * */
    public static int[] threeSumZero(int[] array){


        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            int leftPointer = i;
            int rightPointer = array.length -1;
            while (leftPointer < rightPointer) {
                if (leftPointer != rightPointer && array[leftPointer] + array[i] + array[rightPointer] < 0) {
                    leftPointer++;
                } else if (leftPointer != rightPointer && array[leftPointer] + array[i] + array[rightPointer] > 0) {
                    rightPointer--;
                } else {
                    return new int[]{array[leftPointer], array[i], array[rightPointer]};
                }
            }
        }

        return new int[0];
    }

}
