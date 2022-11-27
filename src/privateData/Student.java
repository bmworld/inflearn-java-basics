package privateData;

public class Student {
	private String name;
	private int score;
	
	public Student (String n, int s) {
		this.name = n;
		this.score = s;
		
		
	}
	
	public void getInfo () {
		System.out.println(" -- getInfo() --");
		System.out.println(" -- name: " + this.name);
		System.out.println(" -- score: " + this.score);
	}
	// ! private 으로 설정한 값을 변경하기 위해서
	// setter getter 를 사용한다.
	
	
	public String getName() {
		return name;
	}
	
	// !  
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		// 조건 등을 추가하여, 값을 변경하고자 할 때, setter를 사용함현 된다
		if(score > 50 && score <= 100) this.score = score;
		
	}

}
