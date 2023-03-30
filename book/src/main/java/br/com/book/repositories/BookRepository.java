package br.com.book.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
