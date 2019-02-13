/**
	 * Gets 2 String as an input original file path and path of destination
	 * 
	 */

package ivan.polovyi.AuxiliarySystem.model.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

/**
 * @author ivan.polovyi
 *
 */
public class CopyFileFromOneDirToAnother {

	private String cutFileFrom;
	private String insertFileTo;

	public CopyFileFromOneDirToAnother(String cutFileFrom, String insertFileTo) {
		this.cutFileFrom = cutFileFrom;
		this.insertFileTo = insertFileTo;
	}

	public void moveFile() {

		
		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File afile = new File(cutFileFrom);
			File bfile = new File(insertFileTo);

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);

			}

			inStream.close();
			outStream.close();

		} catch (IOException e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CopyFileFromOneDirToAnother class_ " + e.toString());
		}
	}
}
