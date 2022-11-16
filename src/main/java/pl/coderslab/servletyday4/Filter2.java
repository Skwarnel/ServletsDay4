package pl.coderslab.servletyday4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String header = req.getHeader("User-Agent");
        System.out.println(header);

        long startTime = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        long stopTime = System.currentTimeMillis();
        long duration = stopTime = startTime;
        System.out.println("By GPS -> Time is: " + duration);

    }
}
