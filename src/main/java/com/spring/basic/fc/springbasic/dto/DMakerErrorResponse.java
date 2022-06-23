package com.spring.basic.fc.springbasic.dto;

import com.spring.basic.fc.springbasic.exception.DMakerErrorCode;
import lombok.*;

/**
 * Created By Cheetah on 2022-06-23.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DMakerErrorResponse {
    private DMakerErrorCode errorCode;
    private String errorMessage;
}
