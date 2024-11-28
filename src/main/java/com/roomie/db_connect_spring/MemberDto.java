package com.roomie.db_connect_spring;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberDto {
    @NotBlank(message = "아이디는 필수 입력값입니다.")
    @Pattern(regexp = "^(?=.*[a-z0-9])[a-z0-9]{3,16}$", message = "아이디는 3~16자 영문 소문자, 숫자만 사용할 수 있습니다.")
    private String id;

    @NotBlank(message = "이름은 필수 입력값입니다")
    private String name;
}
