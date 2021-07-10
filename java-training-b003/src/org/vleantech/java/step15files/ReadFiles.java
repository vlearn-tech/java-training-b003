package org.vleantech.java.step15files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFiles {
	public static void main(String[] args) throws IOException {

		System.out.println("======= N O R M A L    R E A D E R  ===========");
		// Read small file
		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "InputDataFile.csv"));
		for (String line : lines) {
			System.out.println(line);
		}

		System.out.println("======= B U F F E R E D    R E A D E R  ===========");
		// Read large file
		BufferedReader bufferedReader = Files
				.newBufferedReader(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "InputDataFile.csv"));
		bufferedReader.lines().forEach(s -> System.out.println(s));

	}
}
