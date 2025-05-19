<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Queue</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container02">
    <h2>Reservation Queue (Sorted by Time)</h2>

    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
    %>
        <p style="color: green;"><%= message %></p>
    <%
        }
    %>

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Date</th>
            <th>Time</th>
            <th>Seats</th>
        </tr>
        <%
            model.Reservation[] sortedQueue = (model.Reservation[]) request.getAttribute("sortedQueue");
            if (sortedQueue != null) {
                for (model.Reservation res : sortedQueue) {
        %>
        <tr>
            <td><%= res.getName() %></td>
            <td><%= res.getPhone() %></td>
            <td><%= res.getDate() %></td>
            <td><%= res.getTime() %></td>
            <td><%= res.getSeats() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">No reservations found.</td>
        </tr>
        <% } %>
    </table>
</div>
</body>
</html>
