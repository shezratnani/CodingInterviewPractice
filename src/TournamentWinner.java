import java.lang.reflect.Array;
import java.util.*;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> wins = new HashMap<>();
        for(int i = 0; i < competitions.size(); i++){
            if(results.get(i) == 1){
                String team = competitions.get(i).get(0);
                wins.put( team, wins.containsKey(team) ? wins.get(team) + 1 : 1);
            }else{
                String team = competitions.get(i).get(1);
                wins.put( team, wins.containsKey(team) ? wins.get(team) + 1 : 1);
            }
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)));
        for (String s: wins.keySet()) {
            pq.add(new AbstractMap.SimpleEntry<>(s, wins.get(s)));
        }
        // Write your code here.

        return pq.peek().getKey();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> input1 = new ArrayList<>();
        ArrayList<String> input2= new ArrayList<>();
        input.add("HTML");
        input.add("C#");
        competitions.add(input);
        //input.clear();
        input1.addAll(Arrays.asList("C#", "Python"));
        competitions.add(input1);
        //input.clear();
        input2.addAll(Arrays.asList("Python", "HTML"));
        competitions.add(input2);
        results.addAll(Arrays.asList(0, 0, 1));

        System.out.println(tournamentWinner(competitions, results));
    }
}
