package servlet;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.StudentInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/1/12/012.
 */
@WebServlet(urlPatterns = "/all",name = "AllServlet" )
public class AllServlet extends HttpServlet {
    StudentDao studentDao=new StudentDaoImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StudentInfo> list=studentDao.selectAll();
        request.getSession().setAttribute("list",list);
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
