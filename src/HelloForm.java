import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "HelloForm ")
public class HelloForm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String url=request.getParameter("url");

            request.getSession().setAttribute("name",name);
            request.getSession().setAttribute("url",url);


    //        request.getRequestDispatcher("HelloForm.jsp").forward(request, response);
        response.sendRedirect("HelloForm.jsp");
    }
}