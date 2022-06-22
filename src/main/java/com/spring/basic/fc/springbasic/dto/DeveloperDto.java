package com.spring.basic.fc.springbasic.dto;

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
public class DeveloperDto {

    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private String memberId;

    public static DeveloperDto fromEntity(Developer developer) {
        return DeveloperDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .memberId(developer.getMemberId())
                .build();
    }
}
