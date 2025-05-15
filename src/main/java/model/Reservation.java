package model;
// This class represents a reservation in the restaurant table reservation system
public class Reservation {
    // Attributes to store reservation details
    private String name; // Name of the customer
    private String phone;// Phone number of the customer
    private String date;// Reservation date
    private String time;// Reservation time
    private int seats; // Number of seats reserved
//Constructor to initialize a Reservation object with the given details.
    public Reservation(String name, String phone, String date, String time, int seats) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.seats = seats;
    }
// Getter methods to access private fields of the reservation


    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public int getSeats() { return seats; }
}