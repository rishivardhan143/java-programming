import java.util.*;

class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 1; i <= arr.length; i++) {
            result.add(map.getOrDefault(i, 0));
        }

        return result;
    }
}
