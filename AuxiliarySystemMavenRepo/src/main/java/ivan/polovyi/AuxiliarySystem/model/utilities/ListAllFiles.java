package ivan.polovyi.AuxiliarySystem.model.utilities;

import java.io.File;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

public class ListAllFiles {

	static private String directory;

	public ListAllFiles(String dyrectory) {

		try {

			ListAllFiles.directory = dyrectory;

		} catch (Exception e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ListAllFiles class_ " + e.toString());
		}

	}

	public String[] listAllFielesinDirectory() {

		File folder = new File(directory);

		String[] listOfFiles = folder.list();

		return listOfFiles;

	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		ListAllFiles.directory = directory;
	}

}
