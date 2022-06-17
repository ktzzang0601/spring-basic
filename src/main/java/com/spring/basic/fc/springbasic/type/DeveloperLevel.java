package com.spring.basic.fc.springbasic.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created By Cheetah on 2022-06-17.
 */
@AllArgsConstructor
@Getter
public enum DeveloperLevel {
    NEW("신입 개발자"),
    JUNIOR("주니어 개발자"),
    JUNGNIOR("중니어 개발자"),
    SENIOR("시니어 개발자");

    private final String description;

}
