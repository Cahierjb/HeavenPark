package heavenpark.controller;

import heavenpark.model.Utilisateur;

public class LinkAction {
	private String user_name;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	// All Struts Logic Goes In This Method
	public String execute() {
		return "success";
	}
}
