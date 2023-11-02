package rs.ac.ni.pmf.oop2;

import rs.ac.ni.pmf.oop2.storage.FileStorage;
import rs.ac.ni.pmf.oop2.storage.MySQLStorage;

import java.util.Scanner;

public class ParserMain
{
	public static void main(String[] args)
	{
		String path;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Path to file: ");
			path = scanner.next();
		}

		TextParser textParser = new TextParser();
		textParser.setEncoder(new UpperCaseEncoder());
		textParser.setStorage(new FileStorage(path));

		textParser.parse("    avafadogjoidfv  fgkdfopgfdp    ");
		System.out.println("Check the file!");

		try (MySQLStorage storage2 = new MySQLStorage(
				"127.0.0.1",
				3306,
				"root",
				"",
				"mydb"
		)) {
			storage2.connect();
			textParser.setStorage(storage2);
			textParser.parse("sdhgjsdladfbnsoiu hseogrm8h5mjr89td");
			textParser.setStorage(null); // necemo vise koristiti closeable storage!
		}
	}
}
