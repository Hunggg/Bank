package com.bank.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long>{
    @Query(value = "SELECT MAX(id) FROM Branch")
    Long findLastId();
}
