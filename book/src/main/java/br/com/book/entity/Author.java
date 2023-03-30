package br.com.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "author") // nome que fica na tabela do bd
@Entity(name = "author") // como chamar essa classe dentro do spring

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // @Column(name = "id_author")
    public long id;

    @Column(name = "name")
    public String nome;

    public Author(String nome) {
        this.nome = nome;
    }

}
