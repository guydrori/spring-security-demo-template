package app.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    ServletRegistrationBean<WebServlet> h2Servlet() {
        return new ServletRegistrationBean<>(new WebServlet(),"/h2console/*");
    }
}
