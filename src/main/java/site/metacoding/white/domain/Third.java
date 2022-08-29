package site.metacoding.white.domain;

public class Third {
	private Integer id;
	private String title;
	private String content;
		
	@Override
	public String toString() {
		return "Third [titel=" + title + ", content=" + content + "]";
	}

	public Third() {
		System.out.println("Third 생성자 실행됨");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setID 실행됨");
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle (String title) {
		System.out.println("setTitle 실행됨");
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("setContent 실행됨");
		this.content = content;
	}
	
	
	

}
