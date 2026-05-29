🗄 Database Setup

Run the following SQL in MySQL:

CREATE DATABASE moviebooking;

USE moviebooking;

CREATE TABLE tickets(
    id INT PRIMARY KEY,
    movieName VARCHAR(100),
    booked BOOLEAN DEFAULT FALSE
);


📁 Project Structure
MovieTicketBooking/
│
├── src/
│   ├── Main.java
│   ├── model/
│   │   └── Ticket.java
│   ├── controller/
│   │   └── TicketController.java
│   ├── view/
│   │   └── TicketView.java
│   ├── dao/
│   │   └── TicketDAO.java
│   └── util/
│       └── ConnectionUtil.java
│
├── lib/
│   └── mysql-connector-j.jar
│
└── .vscode/
    └── settings.json


🎯 Features
View all movies
Search movie
Book ticket
Cancel ticket
Prevent duplicate booking
Data stored in MySQL
Clean MVC + DAO pattern


🧩 MVC Architecture Summary
Model

Contains data structure (Ticket.java).

View

Handles user input & output (TicketView.java).

Controller

Business logic:

addTicket()
getTickets()
findTicket()
bookTicket()
cancelTicket()
DAO (Data Access Object)

Handles database operations:

INSERT
SELECT
UPDATE


🔧 How Booking Works
User enters movie name
Controller sends request to DAO
DAO checks database
If available → mark as booked
If already booked → show message


📌 Example Output
------ Movie Ticket Booking ------
1. Show Movies
2. Search Movie
3. Book Ticket
4. Cancel Ticket
5. Exit
Enter your choice:


🚀 Future Improvements
GUI using JavaFX
Multiple show timings
Seat selection
User authentication