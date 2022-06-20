package com.spring.basic.fc.springbasic.repository;

import com.spring.basic.fc.springbasic.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Cheetah on 2022-06-20.
 */
@Repository
public interface DeveloperRepository
        extends JpaRepository<Developer, Long> {

}
