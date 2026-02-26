package models;

import Enums.UserRole;
import Enums.UserStatus;

public class User {
	private String name;
	private Integer id;
	private UserStatus status;
	private Boolean isInDebt;
	private UserRole role;

	public User(UserRole role) {
		this.role = role;
		this.status = UserStatus.ACTIVE;
		this.isInDebt = false;
	}

	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return this.id;
	}

	public UserStatus getStatus() {
		return this.status;
	}

	public Boolean getIsInDebt() {
		return this.isInDebt;
	}
	
	public UserRole getRole() {
		return this.role;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setId(Integer id) {
		this.id = id;	
	}

	public void inactiveUser() {
		this.status = Enums.UserStatus.INACTIVE;
	}

	public void activateUser() {
		this.status = Enums.UserStatus.ACTIVE;
	}

}
