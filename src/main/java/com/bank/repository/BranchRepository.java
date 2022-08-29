package com.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long>{
    
}
