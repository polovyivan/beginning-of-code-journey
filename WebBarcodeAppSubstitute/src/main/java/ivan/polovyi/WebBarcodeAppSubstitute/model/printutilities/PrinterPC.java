package ivan.polovyi.WebBarcodeAppSubstitute.model.printutilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class PrinterPC {

	public void print(String filePath) {
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
}
