package Lab5;

public class Manager extends Employee{
	private String post;

	public Manager(String firstName, String lastName, double salary, String post) {
		super(firstName, lastName, salary);
		this.post = post;
	}

	public String getPost() {
		return post;
	}

//	public void setPost(String post) {
//		this.post = post;
//	}
//	

}
