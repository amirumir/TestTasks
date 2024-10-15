import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap <Integer, Integer> countS = new HashMap<>();
        HashMap <Integer, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put((int) s.charAt(i), countS.getOrDefault((int) s.charAt(i), 0) + 1);
            countT.put((int) t.charAt(i), countT.getOrDefault((int) t.charAt(i), 0) + 1);

        }

        return countS.equals(countT);
    }

    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("ccbc","bbcc"));
    }

}
