public class SortedSquaredArrays {

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] squared = new int[array.length];
        int p1 = 0;
        int p2 = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(Math.abs(array[p1]) > Math.abs(array[p2]))
            {
                squared[i] = array[p1] * array[p1];
                p1++;
            }else {
                squared[i] = array[p2] * array[p2];
                p2--;
            }
        }
        return squared;
    }
}
