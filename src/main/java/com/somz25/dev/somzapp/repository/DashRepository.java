package com.somz25.dev.somzapp.repository;
import com.somz25.dev.somzapp.Entity.Dashboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DashRepository extends CrudRepository<Dashboard, Long> {
}
