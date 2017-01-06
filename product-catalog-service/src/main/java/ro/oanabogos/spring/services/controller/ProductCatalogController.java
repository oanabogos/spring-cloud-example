package ro.oanabogos.spring.services.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductCatalogController {

    @Value("${message}")
    private String message;

    @Value("${location}")
    private String location;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message + " from " + this.location;
    }

    @RequestMapping("/dataSource")
    public String getDatasourceCredentials() {
        return "username:" + this.username + " password: " + this.password;
    }

}
