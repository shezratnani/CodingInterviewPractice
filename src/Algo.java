public class Algo {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
//        for(int i : array)
//        {
//            for (int j = 0; j < i; j++){
//                if(array[i] + array[j] == targetSum){
//                    return new int[]{array[i], array[j]};
//                }
//            }
//        }

        for(int i : array)
        {
            for (int j = 0; j < i; j++){
                if(array[i] + array[j] == targetSum){
                    return new int[]{array[i], array[j]};
                }
            }
        }


            return new int[0];
    }
}
