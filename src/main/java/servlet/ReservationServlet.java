package servlet;

import model.Reservation;
import model.QueueArray;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

@WebServlet("/add-reservation")
public class ReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String date = req.getParameter("date");
        String time = req.getParameter("time");

        Reservation res = new Reservation(name, phone, date, time);
        QueueArray.enqueue(res);

        resp.sendRedirect("viewQueue.jsp");
    }
}