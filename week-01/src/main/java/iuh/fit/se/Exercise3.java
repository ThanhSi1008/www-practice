package iuh.fit.se;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Exercise3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(getServletConfig().getInitParameter("id"));
        String name = getServletConfig().getInitParameter("name");
        String email = getServletConfig().getInitParameter("email");

        User user = new User(id, name, email);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(user);

        response.setContentType("application/json;charset=UTF-8");

        response.getWriter().write(jsonString);
    }
}
