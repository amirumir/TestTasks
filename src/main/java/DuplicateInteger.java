import java.util.HashMap;
import java.util.HashSet;

public class DuplicateInteger {
    class Solution {
        public boolean hasDuplicate(int[] nums) {
            HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
            for(int n :nums) {
                if(check.containsKey(n) && check.get(n) >= 1 )
                    return true;
                check.put(n, check.getOrDefault(n, 0) + 1);
            }
            return false;
        }
    }
}
