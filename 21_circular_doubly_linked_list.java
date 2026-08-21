class Main {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;

        return head;
    }

    static void display(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);

        display(head);
    }
}
