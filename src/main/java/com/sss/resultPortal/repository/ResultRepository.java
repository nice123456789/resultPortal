package com.sss.resultPortal.repository;

import com.sss.resultPortal.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    Result findByRollNumber(String rollNumber);
}


