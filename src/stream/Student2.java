package stream;

public class Student2 implements Comparable<Student2> {
	public String name;
	public int score;
	public String gender;
	
	public Student2() {}
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public Student2(String name, int score, String gender) {
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public String getGender() {
		return this.gender;
	}
	
	
	@Override
	public int compareTo(Student2 o) {
		return Integer.compare(score, o.score);
	}
}
