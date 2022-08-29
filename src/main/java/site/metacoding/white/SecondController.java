package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기
// GET -> http body가 없음 -> QueryString, Path Variable(PK) -> Form(GET) -> 브라우저 ( 주소 뒤 ? 붙이기)
// POST, PUT -> http body에 담아줌. -> From(POST) -> JS
// DELETE -> http body가 없음 -> QueryString, Path Variable(PK)

@RestController
public class SecondController {
	
	@GetMapping("/second/{id}") // PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id : " +id;
	}
	
	// QueryString = x-www-form-urlencoded 타입임.
	@GetMapping("/second")
	public String getData2(String title, String content ) {
		return "title : "+title+", content : "+ content;
	}
	
	// BR -: title=제목&content=내용, content-type
	@PostMapping("/second")
	public String postData(String title, String content ) { // 스프링 파싱 기본전략 : x-www-form-urlencoded 
		return "title : "+title+", content : "+ content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content ) {  
		return "title : "+title+", content : "+ content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) {  
		return id + " delete ok";
}
}
