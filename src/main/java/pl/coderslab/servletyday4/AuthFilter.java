package pl.coderslab.servletyday4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebFilter("/admin/*")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        String key = (String) session.getAttribute("user");
        if (Objects.nonNull(key)) {
            if (key.equals("admin")) {
                System.out.println("You are properly logged in");
                filterChain.doFilter(req, resp);
            }
        } else {
            resp.sendRedirect("/login");
        }
    }
}
