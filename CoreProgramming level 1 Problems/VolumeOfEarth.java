public class VolumeOfEarth{
    public static void main(String[] args){
        double radius=6378;
        double volumeInKm=((4/3)*3.14 *(radius*radius*radius));
        double volumeInMiles=volumeInKm*1.6;
        System.out.println("volume in km: "+volumeInKm+ " volume in miles: "+ volumeInMiles);
        
    }
}