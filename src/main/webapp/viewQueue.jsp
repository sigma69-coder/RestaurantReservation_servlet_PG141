<%@ page import="model.QueueArray, model.Reservation" %>
<%@ include file="navbar.jsp" %>
<html>
<head>
    <title>View Queue</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container02">
        <h2>Reservation Queue</h2>
        <table>
            <tr><th>Name</th><th>Phone</th><th>Date</th><th>Time</th></tr>
            <%
                for (Reservation r : QueueArray.getQueue()) {
                    out.println("<tr><td>" + r.getName() + "</td><td>" + r.getPhone() + "</td><td>" + r.getDate() + "</td><td>" + r.getTime() + "</td></tr>");
                }
            %>
        </table>
    </div>
</body>
</html>
