package core.controller.user;

import core.model.user.User;
import core.service.user.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {

    private static String USER_REGISTRATION = "/user-registration.jsp";

    private UserService userService;

    public UserController() {
        super();
        this.userService = new UserService();
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String forward = "";
//
//        String action = request.getParameter("action");
//
//
//        if (action.equalsIgnoreCase("delete")) {
//
//            Long userId = Long.parseLong(request.getParameter("userId"));
//
//            dao.deleteUser(userId);
//
//            forward = LIST_USER;
//
//            request.setAttribute("users", dao.getAllUsers());
//
//        } else if (action.equalsIgnoreCase("edit")) {
//
//            forward = INSERT_OR_EDIT;
//
//            Long userId = Long.parseLong(request.getParameter("userId"));
//
//            User user = dao.getUserById(userId);
//
//            request.setAttribute("user", user);
//
//        } else if (action.equalsIgnoreCase("listUser")) {
//
//            forward = LIST_USER;
//
//            request.setAttribute("users", dao.getAllUsers());
//
//        } else {
//
//            forward = INSERT_OR_EDIT;
//
//        }
//
//
//        RequestDispatcher view = request.getRequestDispatcher(forward);
//
//        view.forward(request, response);
//
//    }

    protected void userRegistration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User();
        user.setId();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setUsername(request.getParameter("username"));
        user.setPasword(request.getParameter("password"));
        this.userService.addUser(user);

        RequestDispatcher view = request.getRequestDispatcher(USER_REGISTRATION);
        //request.setAttribute("users", dao.getAllUsers());
        view.forward(request, response);
    }

}
