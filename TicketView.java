import java.util.*;

class TicketView{

    private Scanner sc=new Scanner(System.in);

    void showMenu(){
        System.out.println("\n--- Ticket Booking Menu ---");
        System.out.println("1. Display Movies");
        System.out.println("2. Search Movie");
        System.out.println("3. Book Ticket");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Exit");
    }

    int getChoice(){
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
    String getMovieName(String msg){
        sc.nextLine();
        System.out.print(msg);
        return sc.nextLine();
    }
    void displayMovies(Ticket[] tickets,int count){
        System.out.println("\nAvailable Movies:");
        for(int i=0;i<count;i++){
            System.out.println(
                tickets[i].getId()+" - "+
                tickets[i].getMovieName()+" - "+
                (tickets[i].isBooked() ? "Booked":"Available")
            );
        }
    }
    void showMessage(String msg){
        System.out.println(msg);
    }
}