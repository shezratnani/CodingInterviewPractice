public class wheels {

    public static void main(String[] args) {
        System.out.println(numWays(2));
    }

    public static int numWays(int n){
        if(n < 2 || n % 2 != 0){
            return 0;
        }else{
            int val = 1;
            val += Math.floor(n/4);
            return val;
        }
    }

}
