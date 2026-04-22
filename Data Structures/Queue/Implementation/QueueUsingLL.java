public class QueueUsingLL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front;
    Node rear;

    

    public void enqueue(int data){
        Node newNode=new Node(data);
        if(rear==null){
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }

    public int dequeue(){
        if(front==null){
            System.out.println("Empty queue");
            return -1;
        }
        else{
            int data=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return data;
        }
    }

    public int peek(){
        if(front==null){
            System.out.println("Empty queue");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        QueueUsingLL queue=new QueueUsingLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is empty: " + queue.isEmpty());
        queue.display();
    }
}
