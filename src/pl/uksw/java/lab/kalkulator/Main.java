/**
 * Pakiet dla aplikacji kalkulator
 */
package pl.uksw.java.lab.kalkulator;

/**
 * @author Przemys³aw Gontarz
 * Powo³uje obiekt typu Menu i pozwala mu dzia³aæ
 */
public class Main {

	/**
	 * @param args Argumenty pobierane
	 */
	public static void main(String[] args) {
		/**
		 * Obiekt wyœwietlaj¹cy interfejs u¿ytkownika
		 */
		Menu menu = new Menu();
		menu.run();
	}

}
