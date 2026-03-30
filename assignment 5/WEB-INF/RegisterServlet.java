import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String salaryStr = request.getParameter("salary");

        try {
            double salary = Double.parseDouble(salaryStr);

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db", "root", "Star@123");

            // Insert data
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO employee(name, email, salary) VALUES (?, ?, ?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);

            int result = ps.executeUpdate();

            if (result > 0) {
                response.sendRedirect("success.jsp");
            } else {
                response.getWriter().println("Error inserting data");
            }

            con.close();

        } catch (Exception e) {
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}