public class DividePens {
    public static void main(String[] args){
        int totalPens=14;
        int students=3;
        int pensPerStudent=totalPens/students;
        int remainingPens=totalPens%students;
        System.out.println("Each student will get "+pensPerStudent+" pens and remaining pens will be "+remainingPens);
    }
}
