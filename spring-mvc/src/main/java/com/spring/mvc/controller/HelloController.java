package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Radha Singh on 19-11-2017.
 */
@Controller
public class HelloController {

    @RequestMapping(value={"/hello","/"},method= RequestMethod.GET)
    public ModelAndView printHello(){
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("message","Hi.. everyone");
        return modelAndView;
    }

}
