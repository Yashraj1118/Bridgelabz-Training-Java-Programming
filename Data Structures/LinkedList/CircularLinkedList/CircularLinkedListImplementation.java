public class CircularLinkedListImplementation {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public Node insertAtBeginning(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; 
            return newNode;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode; 
        newNode.next = head;
        return newNode; 
    }

    public Node insertAtEnd(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; 
            return newNode;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode; 
        newNode.next = head; 
        return head; 
    }

    public Node insertAtPosition(int data, int position, Node head) {
        Node newNode = new Node(data);

        if (position == 1) {
            return insertAtBeginning(data, head);
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        
        if (temp.next == head && i < position - 1) {   
            System.out.println("Position out of bounds");
            return head;
        }}

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public Node deleteAtPosition(int position, Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if (position == 1) {
            if (head.next == head) { 
                return null;
            }
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next; 
            return head.next; 
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head || temp.next.next == head) {   
            System.out.println("Position out of bounds");
            return head;
        }

        temp.next = temp.next.next; 
        return head;
    }


    public static void main(String[] args) {
        CircularLinkedListImplementation circularList = new CircularLinkedListImplementation();
        Node head = null;

        head = circularList.insertAtEnd(10, head);
        head = circularList.insertAtEnd(20, head);
        head = circularList.insertAtEnd(30, head);
        circularList.display(head);

        head = circularList.insertAtBeginning(5, head);
        circularList.display(head);

        head = circularList.insertAtPosition(15, 3, head);
        circularList.display(head);

        head = circularList.deleteAtPosition(2, head);
        circularList.display(head);
    }


}
