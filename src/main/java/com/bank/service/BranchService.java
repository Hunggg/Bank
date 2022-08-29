package com.bank.service;

import java.util.List;

import com.bank.entity.Branch;

public interface BranchService {
    List<Branch> getList();
    Branch save(Branch branch);
}
