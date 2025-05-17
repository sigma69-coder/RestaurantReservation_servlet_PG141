package servlet;

// Importing the required classes from the model packages
import model.Reservation;
import model.QueueArray;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

@WebServlet("/add-reservation")
     public class ReservationServlet extends HttpServlet {
    private static QueueArray queue = new QueueArray(100);


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        int seats = Integer.parseInt(req.getParameter("seats"));

        Reservation res = new Reservation(name, phone, date, time, seats);
        queue.insert(res);

        resp.sendRedirect("view-queue");
    }

    public static QueueArray getQueue() {
        return queue;
    }
}