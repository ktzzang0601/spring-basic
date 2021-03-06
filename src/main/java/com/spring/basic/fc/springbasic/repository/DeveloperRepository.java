package com.spring.basic.fc.springbasic.repository;

import com.spring.basic.fc.springbasic.code.StatusCode;
import com.spring.basic.fc.springbasic.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created By Cheetah on 2022-06-20.
 */
@Repository
public interface DeveloperRepository
        extends JpaRepository<Developer, Long> {

    Optional<Developer> findByMemberId(String memberId);

    List<Developer> findDevelopersByStatusCodeEquals(StatusCode statusCode);

}
