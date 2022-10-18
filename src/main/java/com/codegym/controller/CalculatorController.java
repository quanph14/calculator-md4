package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/home")
    public String index(){
        return "index";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam(name = "paramater1") int paramater1, @RequestParam(name = "paramater2") int paramater2, @RequestParam(name = "operator") String operator, Model model){
        int result;
        switch (operator){
            case "add" :result = paramater1 + paramater2;
                break;
            case "multi" :
                result = paramater1 * paramater2;
                break;
            case "sub" :
                result = paramater1 - paramater2;
                break;
            case "div" :
                result = paramater1 / paramater2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        model.addAttribute("result", result);
        return "result";
    }
}
