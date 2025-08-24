package iuh.fit.se;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "exercise4", value = "/exercise4")
public class Exercise4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + req.getParameter("username") + "</h1>");
        out.println("<h1>" + req.getParameter("email") + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + req.getParameter("username") + "</h1>");
        out.println("<h1>" + req.getParameter("email") + "</h1>");
        out.println("</body></html>");
    }
}
