package br.com.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name = "book")
@Table(name = "book")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    @NotBlank
    @Column(name = "book_name")
    public String name;

    @JoinColumn(name = "author_id")
    @ManyToOne

    private Author author;

    // public Book(String name, Author author) {
    //     this.name = name;
    //     this.author = author;
    // }

}
