package com.bank.service;

import java.util.List;
import java.util.Optional;

import com.bank.entity.Branch;

public interface BranchService {
    List<Branch> getList();
    Branch save(Branch branch);
    Long findLastId();
    Optional<Branch> findBranchbyId(Long id);
    Branch updateBranch(Long id, Branch branch);
}
