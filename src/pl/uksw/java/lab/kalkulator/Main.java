/**
 * Pakiet dla aplikacji kalkulator
 */
package pl.uksw.java.lab.kalkulator;

import java.io.FileNotFoundException;

/**
 * Powo³uje obiekt typu Menu i pozwala mu dzia³aæ
 * @author Przemys³aw Gontarz
 *
 */
public class Main {

	/**
	 * @param args Argumenty pobierane
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		/**
		 * Obiekt wyœwietlaj¹cy interfejs u¿ytkownika
		 */
		Menu menu = new Menu();
		menu.run();
	}

}
