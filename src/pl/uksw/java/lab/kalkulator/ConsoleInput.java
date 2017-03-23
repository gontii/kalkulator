/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.util.Scanner;

/**
 * Klasa obs³uguj¹ca wprowadzanie przez konsole
 * @author Przemek
 *
 */
public class ConsoleInput implements InputMode {
	/**
	 * Pole pozwalaj¹ce na odczyt linijki z linii komend
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
		System.out.println("Wprowadz liniê obliczeñ i zakoñcz przyciskiem Enter.");
		System.out.println("Napis \"koniec\" koñczy wczytywanie kolejnych linijek.");
		return new LineCalculations(keyboard.nextLine());
	}
}
