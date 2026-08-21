import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int x : a) {
            setA.add(x);
        }

        for (int x : b) {
            if (setA.contains(x)) {
                result.add(x);
            }
        }

        System.out.println("Intersection: " + result);
    }
}
