package pl.coderslab.servletyday4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String isbn = req.getParameter("isbn");

        Book book = new Book(title, author, isbn);

        if (Objects.nonNull(title) && Objects.nonNull(author) && Objects.nonNull(isbn)) {

            req.setAttribute("title", title);
            req.setAttribute("author", author);
            req.setAttribute("isbn", isbn);
        }

        getServletContext().getRequestDispatcher("/jsp3.jsp")
                .forward(req, resp);
    }
}
