package br.com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping("/lista")
    public ModelAndView getIndex() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

}
