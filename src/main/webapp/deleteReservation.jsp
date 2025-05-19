<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Reservation</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>Delete a Reservation</h2>
    <form action="delete-reservation" method="post">
        <input type="text" name="phone" placeholder="Enter Phone Number to Delete" required>
        <button type="submit">Delete</button>
    </form>
</div>
</body>
</html>
