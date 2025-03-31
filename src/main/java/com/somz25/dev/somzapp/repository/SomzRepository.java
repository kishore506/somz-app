package com.somz25.dev.somzapp.repository;

import com.somz25.dev.somzapp.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// Interface extending CrudRepository
public interface SomzRepository
        extends CrudRepository<Product, Long> {
}

