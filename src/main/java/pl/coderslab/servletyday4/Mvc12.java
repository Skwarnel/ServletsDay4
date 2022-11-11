package pl.coderslab.servletyday4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String start = req.getParameter("start");
        String end = req.getParameter("end");

        int newStart = Integer.parseInt(start) + 10;
        int newEnd = Integer.parseInt(end) + 10;
        req.setAttribute("newStart", newStart);
        req.setAttribute("newEnd", newEnd);

        getServletContext().getRequestDispatcher("/jsp2.jsp")
                .forward(req, resp);
    }
}
