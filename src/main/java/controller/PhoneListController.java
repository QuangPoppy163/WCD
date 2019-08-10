package controller;

import entity.Phone;
import services.PhoneServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PhoneListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Phone> phoneList = new PhoneServices().getAll();
        req.setAttribute("listPhone", phoneList);
        req.getRequestDispatcher("/phone/list.jsp").forward(req, resp);
    }
}
