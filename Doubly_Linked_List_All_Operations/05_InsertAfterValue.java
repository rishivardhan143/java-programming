class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; }
    }

    Node head = null;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAfter(int value, int data) {
        Node temp = head;
        while (temp != null && temp.data != value) temp = temp.next;

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = temp;
        newNode.next = temp.next;

        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAfter(20, 25);
        list.display();
    }
}