package com.app;

import org.apache.derby.iapi.util.StringUtil;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servl.html")
public class MyServlet extends HttpServlet {

    public DBOps dbops = new DBOps();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("login") != null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        if (request.getParameter("signup") != null) {
            request.getRequestDispatcher("/signup.jsp").forward(request, response);
        }
        if (request.getParameter("home") != null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("login2") != null) {
            String username = dbops.findUser(createUserObject(request));

            if(!(username == null)){
                request.setAttribute("username", username);
                request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            }
            else {
                request.getRequestDispatcher("/usernotfound.jsp").forward(request, response);
            }
        }
        try {
            if (request.getParameter("signup2") != null) {
                User user = dbops.createUser(createUserObject(request));
                request.setAttribute("username", user.getUsername());
                request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            }
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private User createUserObject(HttpServletRequest request){
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setGender(request.getParameter("gender"));
        user.setEmail(request.getParameter("e-mail"));

        return user;
    }
}

