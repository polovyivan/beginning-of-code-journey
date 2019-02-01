package ivan.polovyi.SelfCheckoutMaven.beanclasses;

public class CustomerBean {

	private String number;
	private String name;
	private String wsUserName;
	private String wsPassword;

	public CustomerBean(String number, String name, String wsUserName, String wsPassword) {

		this.number = number;
		this.name = name;
		this.wsUserName = wsUserName;
		this.wsPassword = wsPassword;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWsUserName() {
		return wsUserName;
	}

	public void setWsUserName(String wsUserName) {
		this.wsUserName = wsUserName;
	}

	public String getWsPassword() {
		return wsPassword;
	}

	public void setWsPassword(String wsPassword) {
		this.wsPassword = wsPassword;
	}

}
