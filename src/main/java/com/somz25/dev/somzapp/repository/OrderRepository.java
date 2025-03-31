package com.somz25.dev.somzapp.repository;


import org.springframework.stereotype.Repository;
import com.somz25.dev.somzapp.Entity.Orders;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface OrderRepository extends CrudRepository<Orders, Long>{


}
