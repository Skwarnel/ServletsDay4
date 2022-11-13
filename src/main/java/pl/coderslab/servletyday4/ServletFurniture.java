package pl.coderslab.servletyday4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/furniture")
public class ServletFurniture extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FurnitureDao furnitureDao = new FurnitureDao();
        Furniture furniture0 = furnitureDao.getList().get(0);
        Furniture furniture1 = furnitureDao.getList().get(1);
        Furniture furniture2 = furnitureDao.getList().get(2);
        Furniture furniture3 = furnitureDao.getList().get(3);
        Furniture furniture4 = furnitureDao.getList().get(4);
        Furniture furniture5 = furnitureDao.getList().get(5);

        ArrayList<Furniture> furnitures = new ArrayList<>();

        furnitures.add(furniture0);
        furnitures.add(furniture1);
        furnitures.add(furniture2);
        furnitures.add(furniture3);
        furnitures.add(furniture4);
        furnitures.add(furniture5);

        getServletContext().getRequestDispatcher("/furniture.jsp")
                .forward(req, resp);
    }
}
