package com.springapp.mvc;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value = "addEmployee", method = RequestMethod.GET)
    @ResponseBody
    public String addEmployee(Employee employee) {
        try {
            helloService.save(employee);
            return "Employee added";
        } catch (Exception e) {
            e.printStackTrace();
            return "Exception : " + e;
        }
    }

    @RequestMapping(value = "getAllEmployees", method = RequestMethod.GET)
    @ResponseBody
    public String getAllEmployees() {
        try {
            Map<Object, Object> map = helloService.getAllEmployees();
            return new Gson().toJson(map);
        } catch (Exception e) {
            e.printStackTrace();
            return "Exception :" + e;
        }
    }
}