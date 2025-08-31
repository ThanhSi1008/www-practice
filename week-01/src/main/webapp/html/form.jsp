<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/exercise4" method="post">

  <table>
    <tr>
      <td>Username</td>
      <td><label>
        <input type="text" name="username">
      </label></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><label>
        <input type="email" name="email">
      </label></td>
    </tr>
    <tr>
      <td><input type="submit" value="Submit"></td>
    </tr>
  </table>
</form>
</body>
</html>
