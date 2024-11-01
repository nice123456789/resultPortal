package com.sss.resultPortal.service;

import com.sss.resultPortal.model.Result;
import com.sss.resultPortal.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    private final ResultRepository resultRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public Result findByRollNumber(String rollNumber) {
        return resultRepository.findByRollNumber(rollNumber);
    }
}
