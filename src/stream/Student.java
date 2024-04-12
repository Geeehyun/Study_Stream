package stream;

public class Student implements Comparable<Student> {
	public String name;
	public int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}
