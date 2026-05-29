public class Ticket{
    private int id;
    private String movieName;
    private boolean booked;

    public Ticket(int id,String movieName,boolean booked){
        this.id=id;
        this.movieName=movieName;
        this.booked=booked;
    }

    public Ticket(int id,String movieName){
        this(id, movieName, false);
    }

    public int getId(){
        return id;
    }
    public String getMovieName(){
        return movieName;
    }
    public boolean isBooked(){
        return booked;
    }
    public void setBooked(boolean booked){
        this.booked=booked;
    }
}