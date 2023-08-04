package com.github.andreldsr.libraryjavarestresource.modules.book;

import com.github.andreldsr.libraryjavarestresource.modules.author.Author;
import com.github.andreldsr.libraryjavarestresource.modules.publisher.Publisher;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToMany
    private List<Author> author;
    @ManyToOne
    private Publisher publisher;
}
