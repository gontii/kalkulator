/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Przemys�aw Gontarz 87850
 * Klasa odpowiada za odczyt linii z plik�w
 */
public class FileInput implements InputMode {
	/*
	 * Strumie� powi�zany z plikiem do odczytu z dysku
	 */
	private Scanner file;
	/**
	 * Konstruktor otwiera plik do odczytu
	 * @throws FileNotFoundException Brak pliku do otwarcia
	 */
	public FileInput() throws FileNotFoundException {
		file = new Scanner(new File("calculations.txt"));
	}
	/* (non-Javadoc)
	 * @see pl.uksw.java.lab.kalkulator.InputMode#read()
	 */
	@Override
	public LineCalculations read() {
		// TODO Auto-generated method stub
		if (file.hasNextLine())
		{
			return new LineCalculations(file.nextLine());
		}
		else
		{
			return null;
		}
	}
}
