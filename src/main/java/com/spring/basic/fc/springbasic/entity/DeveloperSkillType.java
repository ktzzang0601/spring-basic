package com.spring.basic.fc.springbasic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created By Cheetah on 2022-06-17.
 */
@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END("백앤드 개발자"),
    FRONT_END("백앤드 개발자"),
    FULL_STACK("백앤드 개발자");

    private final String description;

}