package AdvanceJava.Generics;

public class Bounded <T extends Number> {
    T value;
    Bounded(T value){
        this.value=value;
    }

    public void display(){
        System.out.println("Value: "+value);
    }
    public static void main(String[] args) {
        Bounded<Integer> boundedInt = new Bounded<>(10);
        Bounded<Double> boundedDouble = new Bounded<>(10.5);
        // Bounded<String> boundedString = new Bounded<>("Hello");  // Error: String does not extend Number

        boundedInt.display();
        boundedDouble.display();
    }
}