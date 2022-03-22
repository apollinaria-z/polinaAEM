package by.itechart.polinaAEM.core.servlets.servletFolder;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;

@Component(immediate = true, service = MyService.class)
public class MyService {

    protected void doRedirect(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:4502/content/we-retail/us/en.html?wcmmode=disabled");
    }

}
