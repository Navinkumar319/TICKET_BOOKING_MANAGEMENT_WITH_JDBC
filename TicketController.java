import java.util.List;

public class TicketController{

    private TicketDAO dao=new TicketDAO();
    public void addTicket(int id, String movieName){
        dao.addTicket(new Ticket(id, movieName));
    }
    public Ticket[] getTickets(){
        List<Ticket> list=dao.getAllTickets();
        return list.toArray(new Ticket[0]);
    }
    public int getCount(){
        return dao.getAllTickets().size();
    }
    public Ticket findTicket(String movie){
        return dao.findTicket(movie);
    }
    public String bookTicket(String movie){
        Ticket t=findTicket(movie);

        if(t==null) return "Movie Not Found";
        if(!t.isBooked()){
            dao.updateBooking(movie, true);
            return "Ticket Booked Successfully!";
        }
        return "Ticket Already Booked";
    }

    public String cancelTicket(String movie){
        Ticket t=findTicket(movie);

        if(t==null) return "Movie Not Found";
        if(t.isBooked()){
            dao.updateBooking(movie, false);
            return "Ticket Cancelled Successfully!";
        }
        return "Ticket Not Booked";
    }
}