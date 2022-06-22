package com.spring.basic.fc.springbasic.repository;

import com.spring.basic.fc.springbasic.entity.Developer;
import com.spring.basic.fc.springbasic.entity.RetiredDeveloper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created By Cheetah on 2022-06-20.
 */
@Repository
public interface RetiredDeveloperRepository
        extends JpaRepository<RetiredDeveloper, Long> {

}
