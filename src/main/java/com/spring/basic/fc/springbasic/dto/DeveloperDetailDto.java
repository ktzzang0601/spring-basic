package com.spring.basic.fc.springbasic.dto;

import com.spring.basic.fc.springbasic.code.StatusCode;
import com.spring.basic.fc.springbasic.entity.Developer;
import com.spring.basic.fc.springbasic.code.DeveloperSkillType;
import com.spring.basic.fc.springbasic.type.DeveloperLevel;
import lombok.*;

/**
 * Created By Cheetah on 2022-06-22.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeveloperDetailDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private Integer experienceYears;
    private String memberId;
    private StatusCode statusCode;
    private String name;
    private Integer age;

    public static DeveloperDetailDto fromEntity(Developer developer) {
        return DeveloperDetailDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .experienceYears(developer.getExperienceYears())
                .memberId(developer.getMemberId())
                .statusCode(developer.getStatusCode())
                .name(developer.getName())
                .age(developer.getAge())
                .build();
    }
}
