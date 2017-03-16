/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

/**
 * Klasa obs³uguj¹ca interfejs u¿ytkownika
 * @author Przemys³aw Gontarz
 */
public class Menu 
{
	/**
	 * Pole przechowuj¹ce ostatni wybór u¿ytkownika. Definiuje tryb pracy kalkulatora
	 */
	private int userOption;
	/**
	 * Konstruktor - obecnie brak dzia³añ
	 */
	public Menu()
	{
		
	}
	/**
	 * Metoda odczytuj¹ca wybór u¿ytkownika
	 */
	private void readOption() {
		
	}
	/**
	 * Metoda organizuj¹ca sterowanie programem. Zawiera wywo³anie poszczególnych funkcji programu oraz steruje jego dzia³aniem
	 */
	public void run()
	{
		printMenu();
	}
	/**
	 * Wyœwietlenie menu pozwalaj¹cego na wybór trybu pracy Kalkulatora
	 */
	private void printMenu() {
		System.out.println();
		System.out.println("Menu programu KALKULATOR: ");
		System.out.println("Wybierz tryb dzia³ania kalkulatora: ");
		System.out.println("1. W konsoli");
		System.out.println("2. Z pliku");
		System.out.println("Wybór: ");
	}
}
