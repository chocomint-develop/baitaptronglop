package baitaptronglop;

public class Student {
	private int ID;
	private String name;
	private int age;
	
	//setter 
	public void setID(int MaSV) {
		this.ID = MaSV;
	}
	public void setName(String TenSV) {
		this.name = TenSV;
	}
	public void setAge(int TuoiSV) {
		this.age = TuoiSV;
	}
	//getter 
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Student() {
		
	}
	public Student(int ID, String name, int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}
	
	Student s;
	
}
