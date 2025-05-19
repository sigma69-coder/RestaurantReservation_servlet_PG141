package servlet;

import model.Reservation;
import model.ReservationSorter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

@WebServlet("/view-queue")
public class ViewQueueServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Reservation[] unsorted = ReservationServlet.getQueue().toArray();
        Reservation[] sorted = ReservationSorter.mergeSortByTime(unsorted);

        req.setAttribute("sortedQueue", sorted);//
        req.getRequestDispatcher("viewQueue.jsp").forward(req, resp);
    }
}