package com.gci.codein.springbootapp.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    /*
    * This is controller class from which Spring bean will be created by the application.
    */
@RestController
public class MyController {
    /*
    *
    * @RequestMapping defines the URL path ot the API
    *  and maps it to the info() method.
    */
    @RequestMapping("/Help/About")
    public String info() {
        String test = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>AnkitGCI Project</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<center><h1 style=\"color: blue;\">Welcome to Ankit's Springboot Application!</h1></center>\n" +
                "\t<center><p>This application is implemented by <b>AnkitGCI</b> to demonstrate deployment of spring boot application to a Wildfly server.</p></center>\n" +
                "</body>\n" +
                "</html>";
        return test;
    }
}