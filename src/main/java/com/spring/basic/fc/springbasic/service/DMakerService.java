package com.spring.basic.fc.springbasic.service;

import com.spring.basic.fc.springbasic.dto.CreateDeveloper;
import com.spring.basic.fc.springbasic.entity.Developer;
import com.spring.basic.fc.springbasic.entity.DeveloperSkillType;
import com.spring.basic.fc.springbasic.exception.DMakerErrorCode;
import com.spring.basic.fc.springbasic.exception.DMakerException;
import com.spring.basic.fc.springbasic.repository.DeveloperRepository;
import com.spring.basic.fc.springbasic.type.DeveloperLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.spring.basic.fc.springbasic.exception.DMakerErrorCode.DUPLICATED_MEMBER_ID;
import static com.spring.basic.fc.springbasic.exception.DMakerErrorCode.LEVEL_EXPERIENCE_YEARS_NOT_MATCHED;

/**
 * Created By Cheetah on 2022-06-20.
 */
@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;

    @Transactional
    public void createDeveloper(CreateDeveloper.Request request) {
        validateCreateDeveloperRequest(request);

        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developerRepository.save(developer);
    }

    private void validateCreateDeveloperRequest(CreateDeveloper.Request request) {
        //business validation
        DeveloperLevel developerLevel = request.getDeveloperLevel();
        Integer experienceYear = request.getExperienceYear();
        if (developerLevel == DeveloperLevel.SENIOR
                && experienceYear < 10) {
            throw new DMakerException(LEVEL_EXPERIENCE_YEARS_NOT_MATCHED);
        }
        if (developerLevel == DeveloperLevel.JUNGNIOR
        && (experienceYear < 4 || experienceYear > 10)) {
            throw new DMakerException(LEVEL_EXPERIENCE_YEARS_NOT_MATCHED);
        }
        if (developerLevel == DeveloperLevel.JUNIOR && experienceYear > 4) {
            throw new DMakerException(LEVEL_EXPERIENCE_YEARS_NOT_MATCHED);
        }

        developerRepository.findByMemberId(request.getMemberId())
                .ifPresent((developer -> {
                    throw new DMakerException(DUPLICATED_MEMBER_ID);
                }));
    }
}
