<%--
  Created by IntelliJ IDEA.
  User: xis108
  Date: 25/8/25
  Time: 01:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
<div class="form-container">
    <h2>Registration Form</h2>
    <form method="post" action="../registration" name="registrationForm">
        <label>First Name:</label>
        <label>
            <input type="text" name="firstName" required>
        </label>

        <label>Last Name:</label>
        <label>
            <input type="text" name="lastName" required>
        </label>

        <label>Username:</label>
        <label>
            <input type="text" name="username" required>
        </label>

        <label>Email:</label>
        <label>
            <input type="email" name="email" required>
        </label>

        <label>Password:</label>
        <label>
            <input type="password" name="password" required>
        </label>

        <label>Facebook:</label>
        <label>
            <input type="text" name="facebook">
        </label>

        <label>Short Bio:</label>
        <label>
            <textarea name="shortBio" rows="4"></textarea>
        </label>

        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>


