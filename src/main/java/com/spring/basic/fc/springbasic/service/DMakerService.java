package com.spring.basic.fc.springbasic.service;

import com.spring.basic.fc.springbasic.entity.Developer;
import com.spring.basic.fc.springbasic.entity.DeveloperSkillType;
import com.spring.basic.fc.springbasic.repository.DeveloperRepository;
import com.spring.basic.fc.springbasic.type.DeveloperLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created By Cheetah on 2022-06-20.
 */
@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;

    @Transactional
    public void createDeveloper() {
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developerRepository.save(developer);
    }
}
