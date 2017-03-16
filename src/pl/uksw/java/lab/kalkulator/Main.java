/**
 * Pakiet dla aplikacji kalkulator
 */
package pl.uksw.java.lab.kalkulator;

/**
 * Powołuje obiekt typu Menu i pozwala mu działać
 * @author Przemysław Gontarz
 *
 */
public class Main {

	/**
	 * @param args Argumenty pobierane
	 */
	public static void main(String[] args) {
		/**
		 * Obiekt wyświetlający interfejs użytkownika
		 */
		Menu menu = new Menu();
		menu.run();
	}

}
