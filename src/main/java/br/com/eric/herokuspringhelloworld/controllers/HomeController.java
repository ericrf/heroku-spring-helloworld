package br.com.eric.herokuspringhelloworld.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @RequestMapping("/")
  @ResponseBody String helloWorld(){
    return "Hello World";
  }
}
