import java.util.HashMap;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        Character non_repeating = null;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                non_repeating = ch;
                break;
            }
        }
        return non_repeating;
    }

}
