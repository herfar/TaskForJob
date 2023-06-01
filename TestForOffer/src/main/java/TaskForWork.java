import java.util.*;

public class TaskForWork {
    public static void main(String[] args) {

    System.out.print(countIterations(new int [] {1, 3, 4, 5, 1, 5, 4}));
        
    }
    public static HashMap<Integer, Integer> countIterations(int[] nums) {
        
        HashMap<Integer, Integer> mapping = new HashMap<>();
        
        for (int num : nums) {
            if (mapping.containsKey(num)) {
                mapping.put(num, mapping.get(num) + 1);
            } else {
                mapping.put(num, 1);
            }
        }
        return mapping;
    }
}
