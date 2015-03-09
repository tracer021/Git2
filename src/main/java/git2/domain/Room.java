package git2.domain;

import java.util.Date;

public class Room {

	private Long id;
	
	private String name;
	
	private Table table;
	
	private Date dateCreated;
	
	
	public void prePersist() {
	  if (dateCreated == null) {
		  dateCreated = new Date();
	  }
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Table getTable() {
		return table;
	}
	
	
	
}
