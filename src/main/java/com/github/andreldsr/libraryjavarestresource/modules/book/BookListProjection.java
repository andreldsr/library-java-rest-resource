package com.github.andreldsr.libraryjavarestresource.modules.book;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "bookListProjection", types = {Book.class})
public interface BookListProjection {
    Long getId();
    String getTitle();
    List<AuthorProjection> getAuthor();
}

interface AuthorProjection {
    Long getId();
    String getName();
}

interface PublisherProjection {
    String getName();
}