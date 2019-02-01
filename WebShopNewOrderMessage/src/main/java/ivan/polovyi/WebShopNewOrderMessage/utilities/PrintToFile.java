package ivan.polovyi.WebShopNewOrderMessage.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintToFile {

	public static void printToFile(String tableFile, StringBuilder sbTotal) throws IOException {

		FileWriter fstream = new FileWriter(tableFile);

		BufferedWriter out = new BufferedWriter(fstream);

		out.write(sbTotal.toString());

		out.close();
		fstream.close();
	}

	public static void printToFile(StringBuilder sbscreenTotal, String totalFile) throws IOException {

		FileWriter fstream = new FileWriter(totalFile);

		BufferedWriter out = new BufferedWriter(fstream);

		out.write(sbscreenTotal.toString());

		out.close();
		fstream.close();
	}

}
