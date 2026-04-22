public class StackUsingLL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node top;

    public void push(int data){
        Node newNode= new Node(data);
        newNode.next=top;
        top=newNode;

    }

    public int pop(){
        if(top==null){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            int data=top.data;
            top=top.next;
            return data;
        }
    }

    public int peek(){
        if(top==null){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            return top.data;
        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void display(){
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        StackUsingLL stack=new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        

        System.out.println("Stack elements:");
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop:");
        stack.display();
    }
}
