package helloEveryone;

public class DaQiang {
	private String gender;
	private Integer age;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "DaQiang [gender=" + gender + ", age=" + age + "]";
	}
	
}
