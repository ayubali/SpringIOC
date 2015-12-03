package beans;

import org.springframework.beans.factory.annotation.Required;

public class DAO {
	private String driver;
	private String url;
	private String user;
	private String password;

	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DAO [driver=" + driver + ", url=" + url + ", user=" + user
				+ ", password=" + password + "]";
	}

}
