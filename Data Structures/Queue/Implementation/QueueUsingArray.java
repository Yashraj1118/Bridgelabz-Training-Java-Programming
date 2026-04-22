public class QueueUsingArray {
    int queue[];
    int front;
    int rear;
    int size;

    public QueueUsingArray(int size){
        this.size=size;
        queue=new int[size];
        front=0;
        rear=-1;

    }

    public void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue overflow");
        }
        else{
            rear++;
            queue[rear]=data;
        }
    }

    public int dequque(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int data=queue[front];
            front++;
            return data;
        }
    }

    public int peek(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public void display(){
        if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        System.out.println("Dequeue: " + queue.dequque());
        queue.display();
        System.out.println("Peek: " + queue.peek());
    }
}
