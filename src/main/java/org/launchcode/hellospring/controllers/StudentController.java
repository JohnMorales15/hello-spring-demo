package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("student")
public class StudentController {


    @GetMapping("{name}")
    public String studentName(@PathVariable String name){
        return "<h1>Is your name " + name + "?</h1>.";
    }

    @GetMapping("form")
    public String form(){
        return "<html>" +
                "<h1> Student Form </h1>" +
                "<body>" +
                "<form method='POST' action='/student/result'>" +
                "<input type ='text' name='firstName'/>" +
                "<input type ='text' name='lastName'/>" +
                "<input type ='submit' value='Greet me!'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("result")
    public String resultOfFormSubmission(String firstName, String lastName){
        return "Hello " + firstName +" " + lastName;
    }
}
