package com.github.andreldsr.libraryjavarestresource.modules.publisher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "publisher", path = "publisher")
public interface PublisherRepository extends
        PagingAndSortingRepository<Publisher, Long>,
        CrudRepository<Publisher, Long> {
}
