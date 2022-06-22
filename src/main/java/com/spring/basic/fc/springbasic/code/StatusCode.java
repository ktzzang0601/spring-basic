package com.spring.basic.fc.springbasic.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Cheetah on 2022/06/23
 */
@Getter
@AllArgsConstructor
public enum StatusCode {
    EMPLOYED("고용"),
    RETIRED("퇴직");

    private final String description;
}
