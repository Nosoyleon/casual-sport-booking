package sequentialFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSequantialFile {

	public static ArrayList<String> readLines(String filePath) {

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			ArrayList<String> fileLines = new ArrayList<String>();

			String line;

			while ((line = br.readLine()) != null) {
				fileLines.add(line);
			}
			return fileLines;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error al leer el archivo.");
			return new ArrayList<String>();
		}

	}
}
