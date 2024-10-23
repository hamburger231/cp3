public class CinemaTickets {
    static String CinemaName = "Multikino";
    String FilmTitle;
    String Seat;
    String Row;
    double Price;
    public static String Sample(String FilmTitle, String Seat, String Row, double Price) {
        return CinemaName + " " + FilmTitle + " " + Seat + " " + Row + " " + Price;
    }
}
