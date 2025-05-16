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


    public String getName() { return name; }  //Getter name Method
    public String getPhone() { return phone; }  //Getter phone Method
    public String getDate() { return date; }  //Getter Date Method
    public String getTime() { return time; }   //Getter Time Method
    public int getSeats() { return seats; }  //Getter Seat Method
}