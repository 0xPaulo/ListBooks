package br.com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.book.entity.Author;
import br.com.book.repositories.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthorList() {
        // Iterable<Author> authorInIterable = this.authorRepository.findAll();
        // return Streamable.of(authorInIterable).toList();
        return (List<Author>) this.authorRepository.findAll();
    }
}