import java.util.*;
public class Handshake {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfPeople=sc.nextInt();
        int totalHandshakes=(numberOfPeople*(numberOfPeople-1))/2;
        System.out.println("total handshakes: "+ totalHandshakes);
    }

}
