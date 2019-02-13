package ivan.polovyi.SelfCheckoutMaven.printutilities;

import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class PrinterPC {

	private String filePath;

	public PrinterPC(String filePath) {

		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void print() {
		File file = new File(filePath);
		try {
			Desktop desktop = null;
			if (Desktop.isDesktopSupported()) {
				desktop = Desktop.getDesktop();
			}

			desktop.print(file);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public void printPDFFile() throws PrintException, IOException, PrinterException {
		System.setProperty("sun.java2d.cmm", "sun.java2d.cmm.kcms.KcmsServiceProvider");

		PDDocument document = PDDocument.load(new File(filePath));

		PrintService myPrintService = PrintServiceLookup.lookupDefaultPrintService();

		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPageable(new PDFPageable(document));
		job.setPrintService(myPrintService);
		job.print();
		document.close();
	}

}
