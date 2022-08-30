package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Branch;
import com.bank.service.ServiceImpl.BranchServiceImpl;

@RestController
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    private BranchServiceImpl branchServiceImpl;

    @GetMapping
    public List<Branch> getAllBranch() {
        return branchServiceImpl.getList();
    }

    @PostMapping("save")
    public Branch saveBranch(@RequestBody Branch branch) {
        Branch data = new Branch();
        data.setId(branchServiceImpl.findLastId() + 1);
        data.setName(branch.getName());
        data.setAddress(branch.getAddress());
        return branchServiceImpl.save(data);
    }

    @PutMapping("update/{id}")
    public Branch updateBranch(@PathVariable Long id, @RequestBody Branch branch) {
        return branchServiceImpl.updateBranch(id, branch);
    }
}