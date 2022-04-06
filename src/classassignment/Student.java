package classassignment;

public class Student {
	private int id;
	private String name;
	private String dept;
	private int age;
		
	public int getId() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}
		
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
		
	public void setDept(String dept) {
		this.dept = dept;
	}
		
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student  Id: " + id + " Name: " + name + " Department: " + dept + " Age: "  + age;
	}
}
