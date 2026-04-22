public class SinglyLinkedListImplementation {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node insertAtBeginning(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    public Node insertAtEnd(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node insertAtPosition(int data, int position, Node head) {
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
            System.out.println("Position out of bounds");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public void deleteAtPosition(int position, Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }

    public void deleteAtEnd(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        SinglyLinkedListImplementation list = new SinglyLinkedListImplementation();
        Node head = null;

        head = list.insertAtEnd(10, head);
        head = list.insertAtEnd(20, head);
        head = list.insertAtEnd(30, head);
        list.display(head);

        head = list.insertAtBeginning(5, head);
        list.display(head);

        head = list.insertAtPosition(15, 3, head);
        list.display(head);

        list.deleteAtPosition(2, head);
        list.display(head);

        list.deleteAtEnd(head);
        list.display(head);

        list.deleteAtBeginning(head);
        list.display(head);
    }
}
