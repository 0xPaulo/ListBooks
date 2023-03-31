package br.com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import br.com.book.repositories.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<?> getAuthorList() {
        Iterable<?> authorInIterable = this.authorRepository.findAll();
        return Streamable.of(authorInIterable).toList();
    }
    
}
