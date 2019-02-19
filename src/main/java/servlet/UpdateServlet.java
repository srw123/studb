package servlet;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.StudentInfo;
import org.omg.CORBA.INTERNAL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/1/12/012.
 */
@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    StudentDao studentDao=new StudentDaoImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String type= request.getParameter("type");
           if (type!=null&&"sel".equals(type)){
               Integer id=Integer.valueOf(request.getParameter("id"));
               selectByid(request,response);
           }else  if(type!=null&&"upd".equals(type)){

       }
    }
    public  void selectByid(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
        Integer id=Integer.valueOf(request.getParameter("id"));
        StudentInfo studentInfo=studentDao.selectById(id);
        request.getSession().setAttribute("info",studentInfo);
        response.sendRedirect("Update.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
