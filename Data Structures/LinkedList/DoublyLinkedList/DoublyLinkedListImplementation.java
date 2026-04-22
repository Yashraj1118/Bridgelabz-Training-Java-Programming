public class DoublyLinkedListImplementation {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node insertAtBeginning(int data, Node head) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
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
        newNode.prev = temp;
        return head;
    }

    public Node insertAtPosition(int data, int position, Node head) {
        Node newNode = new Node(data);

        if (position == 1) {
            if (head != null) {
                head.prev = newNode;
            }
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
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        return head;
    }

    public Node deleteAtPosition(int position, Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if (position == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListImplementation list = new DoublyLinkedListImplementation();
        Node head = null;

        head = list.insertAtEnd(10, head);
        head = list.insertAtEnd(20, head);
        head = list.insertAtEnd(30, head);
        list.display(head);

        head = list.insertAtBeginning(5, head);
        list.display(head);

        head = list.insertAtPosition(15, 3, head);
        list.display(head);

        head = list.deleteAtPosition(2, head);
        list.display(head);
    }
}
