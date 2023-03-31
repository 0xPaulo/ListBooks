package br.com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.book.service.AuthorService;


@Controller
public class BookController {

    @Autowired AuthorService authorService; //variavel da classe para usar o metodo ali em baixo

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("bookform"); //aonde tudo vai ficar armazenado para jogar no html
        List<?> authorList = this.authorService.getAuthorList(); //usando o metodo
        mv.addObject("authorList",authorList); // nome para usar depois, e o valor
        return mv; //retornando o html com as info
    }

}
