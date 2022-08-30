package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class RespDto<T>{
	
	private Integer code; // -1 실패 1성공
	private String msg; // 통신에 대한 결과를 메세지로 담기.
	private T body; // 응답해야할 body값을 가짐.
}
