package com.somz25.dev.somzapp.repository;
import org.springframework.stereotype.Repository;
import com.somz25.dev.somzapp.Entity.Payment;
import org.springframework.data.repository.CrudRepository;



public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
