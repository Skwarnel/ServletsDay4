package pl.coderslab.servletyday4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            // dodaj dane do sesji pod kluczem: username
            // przekieruj na adres /admin
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/admin.jsp")
                    .forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/error.jsp")
                    .forward(req, resp);
        }

    }
}
