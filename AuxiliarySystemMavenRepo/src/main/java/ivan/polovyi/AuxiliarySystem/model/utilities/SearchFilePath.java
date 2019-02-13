/**
	 * Gets as an input file directory and file name and returns absolute path as a
	 * String. Example of file directory M:\\cd. File extension has to be specified
	 * .xml for example
	 */

package ivan.polovyi.AuxiliarySystem.model.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

/**
 * @author ivan.polovyi
 *
 */
public class SearchFilePath {

	private String fileDirectory;
	private String fileName;

	public SearchFilePath(String fileDirectory, String fileName) {
		this.fileDirectory = fileDirectory;
		this.fileName = fileName;

	}

	public String returnFilePath() throws Exception {
		String filePath = null;

		try {

			List<File> resultListString = listFilesAndFilesSubDirectories(fileDirectory);

			for (File file : resultListString) {
				if (file.getName().equals(fileName)) {
					filePath = file.getAbsolutePath();

				}
			}
		} catch (Exception e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("SearchFilePath class_ " + e.toString());
		}

		return filePath;

	}

	public static List<File> listFilesAndFilesSubDirectories(String directoryName) {
		List<File> resultList = new ArrayList<File>();
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();

		resultList.addAll(Arrays.asList(fList));

		for (File file : fList) {
			if (file.isFile()) {

			} else if (file.isDirectory()) {

				resultList.addAll(listFilesAndFilesSubDirectories(file.getAbsolutePath()));

			}
		}
		return resultList;
	}

	public String getFileDirectory() {
		return fileDirectory;
	}

	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}