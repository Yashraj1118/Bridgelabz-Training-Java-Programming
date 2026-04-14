public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(){
        System.out.println("Booking ticket for " + movieName + " at seat " + seatNumber + " for price $" + price);
        price += 2.5; 
        System.out.println("Total price after booking fee: $" + price);


    }
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", "A10", 12.5);
        ticket1.bookTicket();
    }
}

