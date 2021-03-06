/**
 * Pakiet dla aplikacji kalkulator
 */
package pl.uksw.java.lab.kalkulator;

import java.io.FileNotFoundException;

/**
 * Powołuje obiekt typu Menu i pozwala mu działać
 * @author Przemysław Gontarz
 *
 */
public class Main {

	/**
	 * @param args Argumenty pobierane
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		/**
		 * Obiekt wyświetlający interfejs użytkownika
		 */
		Menu menu = new Menu();
		menu.run();
	}

}
