public class CinemaTicketsTest {
    public static void main(String[] args) {
        CinemaTickets Ticket1 = new CinemaTickets();
        Ticket1.FilmTitle = "Shrek";
        System.out.println(CinemaTickets.Sample("Shrek", "19", "F",20));
        System.out.println(CinemaTickets.Sample("Joker 2", "8", "B",25));
    }
}
