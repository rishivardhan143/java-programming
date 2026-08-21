class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node getIntersection(Node a, Node b) {
        Node p = a;
        Node q = b;

        while (p != q) {
            p = (p == null) ? b : p.next;
            q = (q == null) ? a : q.next;
        }

        return p;
    }

    public static void main(String[] args) {
        Node common = new Node(30);
        common.next = new Node(40);

        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = common;

        Node b = new Node(5);
        b.next = common;

        Node result = getIntersection(a, b);

        if (result != null) {
            System.out.println("Intersection: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
