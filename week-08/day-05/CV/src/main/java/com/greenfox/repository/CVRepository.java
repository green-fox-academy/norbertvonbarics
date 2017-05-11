package com.greenfox.repository;

import com.greenfox.model.Work;
import org.springframework.data.repository.CrudRepository;


public interface CVRepository extends CrudRepository<Work, Long> {

}
