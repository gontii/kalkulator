/**
 * Pakiet dla aplikacji kalkulator
 */
package pl.uksw.java.lab.kalkulator;

/**
 * @author Przemys�aw Gontarz
 * Powo�uje obiekt typu Menu i pozwala mu dzia�a�
 */
public class Main {

	/**
	 * @param args Argumenty pobierane
	 */
	public static void main(String[] args) {
		/**
		 * Obiekt wy�wietlaj�cy interfejs u�ytkownika
		 */
		Menu menu = new Menu();
		menu.run();
	}

}
