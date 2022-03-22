package by.itechart.polinaAEM.core.servlets.servletFolder;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import java.io.IOException;

@Component(service = Servlet.class, property = {
        "sling.servlet.methods=" + HttpConstants.METHOD_GET,
        "sling.servlet.paths=/content/myPage",
        "sling.servlet.extensions=" + "html"
        })
public class MyAEMservlet extends SlingSafeMethodsServlet {

     @Reference
    MyService myService;

     @Override
     protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        myService.doRedirect(request,response);
     }
}
