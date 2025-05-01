package model;

public class Reservation {
    private String name;
    private String phone;
    private String date;
    private String time;
    private int seats;

    public Reservation(String name, String phone, String date, String time, int seats) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.seats = seats;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public int getSeats() { return seats; }
}