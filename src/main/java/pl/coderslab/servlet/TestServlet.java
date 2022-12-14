package pl.coderslab.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.coderslab.utils.DbUtil;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try {
            Connection connection = DbUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT 1=1");
            if (resultSet.next()) {
                int result = resultSet.getInt(1);
                response.getWriter().println(String.format("It works: %d", result));
            } else {
                response.getWriter().println(String.format("It works: empty"));
            }
        } catch (SQLException e) {
            e.printStackTrace(response.getWriter());
        }

    }


}
