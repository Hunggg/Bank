package com.bank.service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Branch;
import com.bank.repository.BranchRepository;
import com.bank.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public List<Branch> getList() {
        return (List<Branch>) branchRepository.findAll();
    }

    @Override
    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Long findLastId() {
        // return branchRepository.findLastId();
        return null;
    }

    @Override
    public Optional<Branch> findBranchbyId(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Branch updateBranch(Long id, Branch branch) {
        Branch fromDb = branchRepository.findById(id).orElse(null);
        if (fromDb == null) {
            return null;
        }
        fromDb.setName(branch.getName());
        fromDb.setAddress(branch.getAddress());
        return branchRepository.save(fromDb);
    }

}
