package pl.coderslab.servlet;

import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import pl.coderslab.utils.DbUtil;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            Connection connection = DbUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.getWriter().println("It works");
    }


}
