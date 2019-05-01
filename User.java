public class User {
    
	private long id;
	private String firstName;
	private String lastName;
	private String gender ;
	private String email;
	
	// add rest of the variables
	
	public long getId() {
		return id;
	};
	public void setId(long id) {
		this.id = id;
	};
	
	// firstName
	public String getfirstName() {
		return firstName;
	};
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	};
	
	// lastName 
	public String getlastName() {
		return lastName;
	};
	public void setlastName(String lastName) {
		this.lastName = lastName;
	};
	
	// gender
	public String getgender() {
		return gender;
	};
	public void setgender(String gender) {
		this.gender = gender;
	};	

	// email
	public String getemail() {
		return email;
	};
	public void setemail(String email) {
		this.email = email;
	};	
	// add rest of the getters & setters
	
}