package com.insurance.controllers;

import com.insurance.dao.UserDAO;
import com.insurance.models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userDAO.validateUser(username,password);

        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("views/home/userHome.jsp");
        }else{
            response.sendRedirect("views/common/error.jsp");
        }


    }
}
