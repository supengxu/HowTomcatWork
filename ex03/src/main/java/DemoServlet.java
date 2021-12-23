import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet  implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.printf("我进来了");
        PrintWriter out = servletResponse.getWriter();

        out.println("HTTP/1.1 200 OK\r\n" +
                "Content-Type:text/html\r\n" +
                "\r\n");
        out.println("Hello");
        out.println("Hello111");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
