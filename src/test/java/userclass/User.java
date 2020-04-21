package userclass;

public class User {

	String useremail;
	String userpw;
	String username;
	
	


	public User(String useremail, String userpw, String username) {
		// TODO Auto-generated constructor stub
		
		this.useremail=useremail;
		this.userpw=userpw;
		this.username=username;
		
}




	public String getUseremail() {
		return useremail;
	}




	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}




	public String getUserpw() {
		return userpw;
	}




	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}
}