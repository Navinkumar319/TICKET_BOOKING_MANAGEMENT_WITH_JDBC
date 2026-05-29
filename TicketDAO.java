import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO{

    public void addTicket(Ticket t){
        String sql = "INSERT INTO tickets(id, movieName, booked) VALUES (?, ?, ?)";

        try(Connection con = ConnectionUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setInt(1, t.getId());
            ps.setString(2, t.getMovieName());
            ps.setBoolean(3, t.isBooked());
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Ticket> getAllTickets(){
        List<Ticket> list = new ArrayList<>();
        String sql = "SELECT * FROM tickets";

        try(Connection con = ConnectionUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery())
        {
            while(rs.next()){
                list.add(new Ticket(
                    rs.getInt("id"),
                    rs.getString("movieName"),
                    rs.getBoolean("booked")
                ));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public Ticket findTicket(String movie){
        String sql = "SELECT * FROM tickets WHERE movieName=?";

        try(Connection con = ConnectionUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setString(1, movie);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return new Ticket(
                    rs.getInt("id"),
                    rs.getString("movieName"),
                    rs.getBoolean("booked")
                );
            }
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return null;
    }
    public void updateBooking(String movie, boolean status){
        String sql = "UPDATE tickets SET booked=? WHERE movieName=?";

        try(Connection con = ConnectionUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setBoolean(1, status);
            ps.setString(2, movie);
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}