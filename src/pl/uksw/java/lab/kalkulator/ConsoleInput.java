/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.util.Scanner;

/**
 * Klasa obs�uguj�ca wprowadzanie przez konsole
 * @author Przemek
 *
 */
public class ConsoleInput implements InputMode {
	/**
	 * Pole pozwalaj�ce na odczyt linijki z linii komend
	 */
	private Scanner keyboard;
	
	public ConsoleInput() {
		keyboard = new Scanner(System.in);
	}
	/* (non-Javadoc)
	 * @see pl.uksw.java.lab.kalkulator.InputMode#read()
	 */
	@Override
	public LineCalculations read() {
		System.out.println("Wprowadz lini� oblicze� i zako�cz przyciskiem Enter.");
		System.out.println("Napis \"koniec\" ko�czy wczytywanie kolejnych linijek.");
		return new LineCalculations(keyboard.nextLine());
	}
}
