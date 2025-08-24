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
        <input type="text" name="firstName" required>

        <label>Last Name:</label>
        <input type="text" name="lastName" required>

        <label>Username:</label>
        <input type="text" name="username" required>

        <label>Email:</label>
        <input type="email" name="email" required>

        <label>Password:</label>
        <input type="password" name="password" required>

        <label>Facebook:</label>
        <input type="text" name="facebook">

        <label>Short Bio:</label>
        <textarea name="shortBio" rows="4"></textarea>

        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>


