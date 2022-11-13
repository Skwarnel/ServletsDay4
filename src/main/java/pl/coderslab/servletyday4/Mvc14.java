package pl.coderslab.servletyday4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("title1", "author1", "isbn14");
        Book book2 = new Book("title2", "author2", "isbn13");
        Book book3 = new Book("title3", "author3", "isbn12");
        Book book4 = new Book("title4", "author4", "isbn11");
        Book book5 = new Book("title5", "author5", "isbn10");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        req.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/resultList.jsp")
                .forward(req, resp);
    }
}
