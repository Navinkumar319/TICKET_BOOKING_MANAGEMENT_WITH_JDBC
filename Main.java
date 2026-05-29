public class Main{
    public static void main(String[] args){

        TicketController controller=new TicketController();
        TicketView view = new TicketView();

        controller.addTicket(1,"KARUPU");
        controller.addTicket(2,"YOUTH");
        controller.addTicket(3,"SIRAI");
        controller.addTicket(4,"BLAST");
        controller.addTicket(5,"PREMALU");
        controller.addTicket(6,"KARA");


        while(true){

            view.showMenu();
            int choice = view.getChoice();

            switch(choice){

                case 1:
                    view.displayMovies(controller.getTickets(), controller.getCount());
                    break;

                case 2:
                    String search = view.getMovieName("Enter movie name: ");
                    if(controller.findTicket(search)!=null)
                        view.showMessage("Movie Found");
                    else
                        view.showMessage("Movie Not Found");
                    break;

                case 3:
                    String book=view.getMovieName("Enter movie name to book: ");
                    view.showMessage(controller.bookTicket(book));
                    break;

                case 4:
                    String cancel=view.getMovieName("Enter movie name to cancel: ");
                    view.showMessage(controller.cancelTicket(cancel));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}