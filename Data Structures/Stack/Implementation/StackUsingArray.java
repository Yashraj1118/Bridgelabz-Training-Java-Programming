public class StackUsingArray {
    
        int arr[];
        int top;
        int size;

        public StackUsingArray(int size){
            this.size=size;
            arr=new int[size];
            top=-1;
        }
    

    public void push(int data){
        if(top==size-1){
            System.out.println("Stack overflow");        
        }else{
            top++;
            arr[top]=data;

        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int data=arr[top];
            top--;
            return data;
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return arr[top];
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            for(int i=top;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        StackUsingArray stack=new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.display();
    }


}

