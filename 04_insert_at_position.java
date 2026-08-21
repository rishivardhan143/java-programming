class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);

        head = insertAtPosition(head, 20, 2);
        display(head);
    }
}
