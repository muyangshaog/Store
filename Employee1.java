package practice1;

public class Employee1 extends Person {
	
	private String position;
	public Employee1()
	{
		
	}
	
	public Employee1(int id, String firstName, String lastName, int age, String position) {
		super();
		this.init(id, firstName, lastName, age);
		setposition(position);
	}

	private void init(int id, String firstName, String lastName, int age) {
		super.setId(id);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		super.setAge(age);
	}
	public String getposition() {
		return position;
	}

	public void setposition(String position) {
		this.position = position;
	}
	
}
