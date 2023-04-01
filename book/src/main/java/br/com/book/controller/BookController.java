package br.com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.book.entity.Author;
import br.com.book.entity.Book;
import br.com.book.service.AuthorService;
import jakarta.validation.Valid;

@Controller
public class BookController {

    @Autowired
    AuthorService authorService; // variavel da classe para usar o metodo ali em baixo

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("bookform"); // aonde tudo vai ficar armazenado para jogar no html
        List<Author> authorList = this.authorService.getAuthorList(); // usando o metodo
        mv.addObject("authorList", authorList); // nome para usar depois, e o valor
        return mv; // retornando o html com as info
    }

    // @PostMapping("/book/form/save")
    // public String saveBook(@Valid Book book, BindingResult result,
    //         RedirectAttributes redirect) {
    //     if (result.hasErrors()) {
    //         redirect.addFlashAttribute("mensagem",
    //                 "Verifique os campos obrigarios");
    //     }
    //     return "redirect:/lista";
    // }

}
