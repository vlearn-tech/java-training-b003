package org.vlearntech.java.step91miniprojectwithobjectfile;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RegionalReportReader {
	public static void main(String[] args) {
		List<RegionalReport> regionalReport = getAllRecordsFromFile("C:\\Users\\HP\\Desktop\\JavaFiles",
				"RegionalReportObjectFile.txt");
		regionalReport.forEach(System.out::println);
	}

	private static List<RegionalReport> getAllRecordsFromFile(String folderName, String fileName) {
		Path path = Paths.get(folderName, fileName);
		List<RegionalReport> reports = new ArrayList<>();
		try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
			RegionalReport rep;
			while ((rep = (RegionalReport) inputStream.readObject()) != null) {
				reports.add(rep);
			}
		} catch (EOFException e) {
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		return reports;
	}
}
