package iuh.fit.se;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class Exercise5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password"); // không hiển thị
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        out.println("<html><head>");
        out.println("<title>Registration Result</title>");
        out.println("<link rel='stylesheet' type='text/css' href='css/style.css'>");
        out.println("</head><body>");

        out.println("<div class='result-container'>");
        out.println("<h2>Registration Result</h2>");
        out.println("<p><b>First Name:</b> " + firstName + "</p>");
        out.println("<p><b>Last Name:</b> " + lastName + "</p>");
        out.println("<p><b>Username:</b> " + username + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Facebook:</b> " + facebook + "</p>");
        out.println("<p><b>Short Bio:</b> " + shortBio + "</p>");
        out.println("<hr><p><i>Password is not displayed for security reasons.</i></p>");
        out.println("</div>");

        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
