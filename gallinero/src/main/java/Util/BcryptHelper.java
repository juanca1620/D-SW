package Util;

import org.mindrot.jbcrypt.BCrypt;

public class BcryptHelper {

	public static String hashPassword (String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	public static boolean checkPassword (String password) {
		return BCrypt.checkpw(password, hashPassword(password));
	}
}
