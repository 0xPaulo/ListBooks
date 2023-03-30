package br.com.book.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "book")
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // @Column(name = "id_book")
    public Long id;

    @Column(name = "name")
    public String nome;
    
    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    public Book(String nome, Author author) {
        this.nome = nome;
        this.author = author;
    }
}
