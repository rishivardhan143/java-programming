import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) set.add(x);
        for (int x : b) set.add(x);

        System.out.println("Union: " + set);
    }
}
