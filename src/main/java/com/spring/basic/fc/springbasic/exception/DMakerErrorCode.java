package com.spring.basic.fc.springbasic.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Cheetah on 2022/06/20
 */
@Getter
@AllArgsConstructor
public enum DMakerErrorCode {
    NO_DEVELOPER("해당되는 개발자가 없습니다."),
    DUPLICATED_MEMBER_ID("MemberId가 중복되는 개발자가 있습니다."),
    LEVEL_EXPERIENCE_YEARS_NOT_MATCHED("개발자 레벨과 연차가 맞지 않습니다."),

    INTERNAL_SERVER_ERROR("서버에 오류가 발생하였습니다."),
    INVALID_REQUEST("잘못된 요청입니다.");

    private final String message;
}
