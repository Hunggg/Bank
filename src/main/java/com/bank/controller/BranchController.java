package com.bank.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Branch;
import com.bank.service.ServiceImpl.BranchServiceImpl;

@RestController
public class BranchController {
    // private Logger logger;
    @Autowired
    private BranchServiceImpl branchServiceImpl;

    @GetMapping("/")
    public List<Branch> getAllBranch() {
        return branchServiceImpl.getList();
    }

    @PostMapping("/branch")
    public Branch saveBranch(@RequestBody Branch branch) {
        Branch data = new Branch();
        data.setId(branchServiceImpl.findLastId() + 1);
        data.setName(branch.getName());
        data.setAddress(branch.getAddress());
        return branchServiceImpl.save(data);
    }

    @GetMapping("/last")
    public Long findLastId() {
        return branchServiceImpl.findLastId();
    }

    @PutMapping("/update/{id}")
    public Branch updateBranch(@PathVariable Long id, @RequestBody Branch branch) {
        return branchServiceImpl.updateBranch(id, branch);
    }
}