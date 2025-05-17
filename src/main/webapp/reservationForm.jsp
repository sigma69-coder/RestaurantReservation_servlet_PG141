<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Make Reservation</title> <%-- Page Title --%>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Make a Reservation</h2><%-- Page heading --%>
        <form action="add-reservation" method="post">  <%-- Form will send data to the "add-reservation" servlet using the POST method --%>
            <input type="text" name="name" placeholder="Name" required> <%-- Input field for user's name. Required means the user must fill it before submitting --%>
            <input type="text" name="phone" placeholder="Phone" required> <%-- Input field for user's phone number. Required field --%>
            <input type="date" name="date" required> <%-- Input field for selecting a reservation date --%>
            <input type="time" name="time" required> <%-- Input field for selecting reservation time --%>
            <input type="number" name="seats" placeholder="Seats" required><%-- Input field for the number of seats to reserve --%>

            <button type="submit">Reserve</button>  <%-- Submit button to send the form data to the server --%>
        </form>
    </div>
    <script src="js/script.js"></script>
</body>
</html>
