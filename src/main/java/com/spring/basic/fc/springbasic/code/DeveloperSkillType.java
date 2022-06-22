package com.spring.basic.fc.springbasic.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created By Cheetah on 2022-06-17.
 */
@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END("백앤드 개발자"),
    FRONT_END("프론트앤드 개발자"),
    FULL_STACK("풀스택 개발자");

    private final String description;

}
