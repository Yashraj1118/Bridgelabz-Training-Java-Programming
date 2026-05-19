package AdvanceJava.Annotations;

public class DepricatedDemo {

    @Deprecated
    void oldMethod(){
    System.out.println("Old");
    }

    void newMethod(){
    System.out.println("New");
    }

    public static void main(String[] args) {
        DepricatedDemo obj = new DepricatedDemo();
        obj.oldMethod(); // This will show a warning because it's deprecated
        obj.newMethod();
    }
}