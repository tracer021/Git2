package git2.domain;

public class Admin {
	
	private Long id; 
	
	private String userName;
	
	private String password;
	
	private Integer level;
	
	public String getPassword() {
		return password;
	}

	public Integer getLevel() {
		return level;
	}

	public Long getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	

}
