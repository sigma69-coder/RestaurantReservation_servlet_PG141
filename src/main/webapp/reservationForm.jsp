<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Make Reservation</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Make a Reservation</h2>
        <form action="add-reservation" method="post">
            <input type="text" name="name" placeholder="Name" required>
            <input type="text" name="phone" placeholder="Phone" required>
            <input type="date" name="date" required>
            <input type="time" name="time" required>
            <input type="number" name="seats" placeholder="Seats" required>
            <button type="submit">Reserve</button>
        </form>
    </div>
    <script src="js/script.js"></script>
</body>
</html>
