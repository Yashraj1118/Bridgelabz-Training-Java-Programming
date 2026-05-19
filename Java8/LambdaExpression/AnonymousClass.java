package AdvanceJava.Java8.LambdaExpression;


//                                              Anonymous class------>>>>>  implementing an interface

// interface person{
//     void display();
// }

// public class AnonymousClass {
//     public static void main(String[] args) {
//         person p=new person(){
//             public void display(){
//                 System.out.println("Hello, I am an anonymous class!");
//             }
//         };
//         p.display();
//     }
// }





//                          Implementing an interface using lambda expression


// interface person{
//     void display();
// }

// public class AnonymousClass {
//     public static void main(String[] args) {
//         person p=()->System.out.println("Hello, I am a lambda expression!");
//         p.display();
//     }
// }





//                                                  Anonymous class------>>>>>  extending a class



// public class AnonymousClass {
//     public static void main(String[] args) {
//         Thread t=new Thread(){
//             public void run(){
//                 System.out.println("Thread is running...");
//             }
//         };
//         t.run();
//     }
// }

// class Thread{
//     void run(){
//         System.out.println("Hello, I am a person!");
//     }
// }






//                                          Anonymous class------>>>>>  extending a class using lambda expression

public class AnonymousClass {
    public static void main(String[] args) {
        Thread t=()->System.out.println("Thread is running...");
        t.run();
    }
}

interface Thread{
    void run();
}