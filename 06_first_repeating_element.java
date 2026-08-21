import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                System.out.println("First repeating element: " + x);
                return;
            }
            set.add(x);
        }

        System.out.println("No repeating element");
    }
}
