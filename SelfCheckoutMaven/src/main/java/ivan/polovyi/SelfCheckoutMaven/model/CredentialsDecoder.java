package ivan.polovyi.SelfCheckoutMaven.model;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;

public class CredentialsDecoder {

	private String accessKey;

	public CredentialsDecoder(String accessKey) {

		this.accessKey = accessKey;
	}

	public CustomerBean credentialDecoding() {

		String user = null;
		String password = null;

		 user = StringUtils.substringBefore(accessKey, "+");

		 password = StringUtils.substringAfter(accessKey, "+");

		return new CustomerBean(null, null, user, password);
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

}
