<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login</title>
    <link rel="stylesheet" type="text/css" href="../styles/style.css">
</head>
<body>
    <div class="login-container">
        <h2>User Login</h2>
        <form action="${pageContext.request.contextPath}/userLogin" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <button type="submit">Login</button>
            </div>
        </form>
        <div class="form-group">
            <p>Don't have an account? <a href="userRegistration.jsp">Sign Up</a></p>
        </div>
    </div>
</body>
</html>
