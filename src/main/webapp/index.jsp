<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Restaurant Table Reservation</title>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
</head>
<body>
    <%@ include file="navbar.jsp" %>

    <div class="container">
        <h1>Welcome to Our Restaurant Table Reservation System</h1>
        <a href="reservationForm.jsp" class="btn">Make a Reservation</a>
        <a href="view-queue" class="btn">View Queue</a>
    </div>

    <!-- Login Modal -->
    <div id="loginModal" class="modal">
        <div class="modal-content">
            <h3>Login</h3>
            <form>
                <input type="text" placeholder="Username" required><br>
                <input type="password" placeholder="Password" required><br>
                <button type="submit">Login</button><br>
                <p>New customer? <a href="#">Sign Up</a></p>
            </form>
        </div>
    </div>

   <!-- Bottom Ad Popup -->
   <div class="ad-popup" id="adPopup">
       <span style="position:absolute; top:5px; right:10px; cursor:pointer; font-weight:bold;" onclick="closeAd()">❌</span>
       <p>🎉 Sign up now and get exclusive discounts! <a href="#" style="color:#00f">Login / Sign Up</a></p>
   </div>
</body>
</html>

