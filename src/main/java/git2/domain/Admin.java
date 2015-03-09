package git2.domain;

import java.util.Date;

public class Admin {
	
	private Long id; 
	
	private String userName;
	
	private String password;
	
	private Integer level;
	
	private Date dateCreated;
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
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
