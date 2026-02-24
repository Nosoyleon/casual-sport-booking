package models;

import Enums.UserStatus;

public class User {
	private String name;
	private Integer Id;
	private UserStatus status;
	private Boolean isInDebt;

	public User(String name, Integer Id, UserStatus status, Boolean isInDebt) {
		this.name = name;
		this.Id = Id;
		this.status = status;
		this.isInDebt = isInDebt;
	}

	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return this.Id;
	}

	public UserStatus getStatus() {
		return this.status;
	}

	public Boolean getIsInDebt() {
		return this.isInDebt;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void inactiveUser() {
		this.status = Enums.UserStatus.INACTIVE;
	}

	public void activateUser() {
		this.status = Enums.UserStatus.ACTIVE;
	}

}
