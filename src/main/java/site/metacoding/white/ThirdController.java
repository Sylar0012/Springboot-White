package site.metacoding.white;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.metacoding.white.domain.Third;

// 고급 데이터 받기 (json, X-www-form~, text)

@RestController
public class ThirdController {
	
	@PostMapping("/third")
	public String postData(Third third) {
		return "id : "+third.getId()+", title : "+third.getTitle()+", content : "+third.getContent();
	}	
	
	//UPDATE third SET title=?,content=? WHERE id = ?
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id,@RequestBody Third third) {
		return third.toString();
	}
}
