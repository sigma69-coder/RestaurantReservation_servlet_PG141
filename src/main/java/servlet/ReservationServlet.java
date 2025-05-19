package servlet;

// Importing the required classes from the model packages
import model.Reservation;
import model.QueueArray;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
// Define the servlet and map it to the URL pattern "/add-reservation"
@WebServlet("/add-reservation")
     public class ReservationServlet extends HttpServlet {
    // Create a static queue to hold reservation objects with a maximum size of 100
     private static QueueArray queue = new QueueArray(100);
    // This method handles POST requests from the reservation form
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // Retrieve form parameters sent from the client
         String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        int seats = Integer.parseInt(req.getParameter("seats"));
// Create a new Reservation object using the retrieved data
         Reservation res = new Reservation(name, phone, date, time, seats);
         // Insert the reservation into the queue
        queue.insert(res);
// Redirect the user to the page that displays the current queueresp.sendRedirect("view-queue");
    }
    // Static method to allow access to the queue from other classes
    public static QueueArray getQueue() {
        return queue;
    }
 }