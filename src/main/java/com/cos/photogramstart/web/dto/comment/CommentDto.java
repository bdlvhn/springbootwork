package com.cos.photogramstart.web.dto.comment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// NotNull = 널값 체크
// NotEmpty = 빈값이거나 널체크
// NotBlank = 빈값이거나 널체크 그리고 빈 공백(space)까지

import lombok.Data;

@Data
public class CommentDto {
	@NotBlank // 빈값 체크 널 공백까지 체크
	private String content;
	@NotNull // 널 체크
	private Integer imageId;
	//toEntity가 필요 없다.
}
