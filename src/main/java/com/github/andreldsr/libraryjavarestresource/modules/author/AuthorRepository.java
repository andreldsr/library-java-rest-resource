package com.github.andreldsr.libraryjavarestresource.modules.author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "author", path = "author")
public interface AuthorRepository extends
        PagingAndSortingRepository<Author, Long>,
        CrudRepository<Author, Long> {
}
