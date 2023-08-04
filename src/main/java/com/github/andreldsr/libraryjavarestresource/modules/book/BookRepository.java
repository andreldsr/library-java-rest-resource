package com.github.andreldsr.libraryjavarestresource.modules.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book", excerptProjection = BookListProjection.class)
public interface BookRepository extends
        PagingAndSortingRepository<Book, Long>,
        CrudRepository<Book, Long> {
}
