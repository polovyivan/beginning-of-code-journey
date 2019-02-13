package ivan.polovyi.SelfCheckoutMaven.barcode;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;

public class Encryptor {

	private static CustomerBean customer;
	private static final String KEY = "exampleforgit123";
	private static final String INIT_VECTOR = "Gitexampleabcder"; // 16 bytes IV

	public Encryptor(CustomerBean customer) {

		Encryptor.customer = customer;
	}

	public CustomerBean encrypt() {

		try {
			IvParameterSpec iv = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(KEY.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal((customer.getWsUserName() + "+" + customer.getWsPassword()).getBytes());
			System.out.println("encrypted string: " + Base64.encodeBase64String(encrypted));
			customer.setCredentialsEnscripted(Base64.encodeBase64String(encrypted));
			return customer;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public CustomerBean decrypt() {
		System.out.println(customer.getCredentialsEnscripted());
		try {
			IvParameterSpec iv = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(KEY.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

			byte[] original = cipher.doFinal(Base64.decodeBase64(customer.getCredentialsEnscripted()));
			customer.setBarcodeKey(new String(original));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		Encryptor.customer = customer;
	}

	public static String getKey() {
		return KEY;
	}

	public static String getInitVector() {
		return INIT_VECTOR;
	}
}