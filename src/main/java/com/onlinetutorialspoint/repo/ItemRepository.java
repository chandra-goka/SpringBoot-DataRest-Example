package com.onlinetutorialspoint.repo;


import com.onlinetutorialspoint.domain.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="items",collectionResourceRel = "items")
public interface ItemRepository extends PagingAndSortingRepository<Item,Long> {
    List<Item> findByCategory(@Param("category") String category);
}
