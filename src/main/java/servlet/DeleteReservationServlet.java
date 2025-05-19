package servlet;

import model.QueueArray;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

@WebServlet("/delete-reservation")
public class DeleteReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone = req.getParameter("phone");
        QueueArray queue = ReservationServlet.getQueue();

        boolean deleted = queue.deleteByPhone(phone);

        req.setAttribute("queue", ReservationServlet.getQueue().toArray());
        req.setAttribute("message", deleted ? "Reservation deleted successfully." : "Phone number not found.");
        req.getRequestDispatcher("viewQueue.jsp").forward(req, resp);

    }
}
