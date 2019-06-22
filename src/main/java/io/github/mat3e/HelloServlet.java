package io.github.mat3e;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="hello", urlPatterns={"/api/*"})
public class HelloServlet extends HttpServlet {
private static final String NAME_PARAM = "name";

private HelloService service;

@SuppressWarnings("unused")
public HelloServlet(){
    this(new HelloService());
}

HelloServlet(HelloService service){
    this.service = service;
}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write(service.prepareGreeting(req.getParameter(NAME_PARAM)));
    }
}
