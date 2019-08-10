package controller;

import entity.Phone;
import services.PhoneServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PhoneAddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/phone/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");

        Phone phone = new Phone();
        phone.setName(name);
        phone.setBrand(brand);
        phone.setPrice(price);
        phone.setDescription(description);

        PhoneServices phoneServices = new PhoneServices();
        phoneServices.save(phone);

        resp.sendRedirect("/phone/list");
    }
}
