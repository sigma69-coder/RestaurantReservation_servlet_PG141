package servlet;

import model.QueueArray;
import model.Reservation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.Queue;

@WebServlet("/view-queue")
public class ViewQueueServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the reservation queue
        Queue<Reservation> queue = QueueArray.getQueue();

        // Pass it to the JSP page
        req.setAttribute("queue", queue);

        // Forward the request to the JSP
        req.getRequestDispatcher("viewQueue.jsp").forward(req, resp);
    }
}