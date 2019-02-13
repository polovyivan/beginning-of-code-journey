package ivan.polovyi.SelfCheckoutMaven.barcode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;

public class BarCodeGenerator {

	private static String barcodeFilePath;
	private CustomerBean customer;

	public BarCodeGenerator(String barcodeFilePath, CustomerBean customer) {

		BarCodeGenerator.barcodeFilePath = barcodeFilePath;
		this.customer = customer;
	}

	public void generateBarcode() {

		Rectangle one = new Rectangle(90, 80);
		Document document = new Document(one);
		PdfWriter writer = null;
		try {
			writer = PdfWriter.getInstance(document, new FileOutputStream(getBarcodeFilePath()));
		} catch (FileNotFoundException | DocumentException e) {

			e.printStackTrace();
		}
		one.setBorder(Rectangle.BOX);
		one.setBorderWidth(1);
		document.open();

		Barcode128 code128 = new Barcode128();

		code128.setSize(12f);
		code128.setBarHeight(25);

		code128.setAltText(customer.getName());
		code128.setCode(customer.getBarcodeKey());
		Image image128 = code128.createImageWithBarcode(writer.getDirectContent(), null, null);

		Image imgLogo = null;
		try {
			String pictureName = "C:\\SelfCheckout\\Logo.png";
			imgLogo = Image.getInstance(pictureName);

		} catch (BadElementException | IOException e1) {

			e1.printStackTrace();
		}
		imgLogo.scaleToFit(70, 75);
		imgLogo.setAbsolutePosition(10, 36);
		image128.setAbsolutePosition(13, 5);

		try {
			document.add(image128);
			document.add(imgLogo);
		} catch (DocumentException e) {

			e.printStackTrace();
		}

		document.close();

	}

	public static String getBarcodeFilePath() {
		return barcodeFilePath;
	}

	public void setBarcodeFilePath(String barcodeFilePath) {
		BarCodeGenerator.barcodeFilePath = barcodeFilePath;
	}

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

}
