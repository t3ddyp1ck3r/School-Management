package datamodel;

public class Admin {
		
		private int adminId;
		private String username;
		private String password;
		
		
		// Constructor
	    public Admin(int adminId, String username, String password) {
	        this.adminId = adminId;
	        this.username = username;
	        this.password = password;
	    }

	    // Getter methods
	    public int getAdminId() {
	        return adminId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    // Setter methods
	    public void setAdminId(int adminId) {
	        this.adminId = adminId;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	}