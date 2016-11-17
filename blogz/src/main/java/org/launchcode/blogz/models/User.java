package org.launchcode.blogz.models;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User extends Entity {

	private String username;
	private String hashedPassword;
	public static List<User> users = new ArrayList<User>();

	public User(String plainPassword) {
		super();
		this.hashedPassword = hashPassword(plainPassword);
	}

	public User(String username, String plainPassword) throws Exception {
		super();
		if (isValidUsername(username)) {
			this.username = username;
		} else
			throw new Exception("Invalid Username");
		this.hashedPassword = hashPassword(plainPassword);
	}

	public static String hashPassword(String plainPassword) {
		return plainPassword;

	}

	public boolean isValidPassword(String plainPassword) {
		String hashedp = hashPassword(plainPassword);
		if (hashedp.equals(this.hashedPassword)) {
			return true;

		} else
			return false;
	}

	public static boolean isValidUsername(String username) {
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		if (m.matches()) {
			return true;

		} else
			return false;
	}

}
