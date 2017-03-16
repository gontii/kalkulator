/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

/**
 * Klasa obs�uguj�ca interfejs u�ytkownika
 * @author Przemys�aw Gontarz
 */
public class Menu 
{
	/**
	 * Pole przechowuj�ce ostatni wyb�r u�ytkownika. Definiuje tryb pracy kalkulatora
	 */
	private int userOption;
	/**
	 * Konstruktor - obecnie brak dzia�a�
	 */
	public Menu()
	{
		
	}
	/**
	 * Metoda odczytuj�ca wyb�r u�ytkownika
	 */
	private void readOption() {
		
	}
	/**
	 * Metoda organizuj�ca sterowanie programem. Zawiera wywo�anie poszczeg�lnych funkcji programu oraz steruje jego dzia�aniem
	 */
	public void run()
	{
		printMenu();
	}
	/**
	 * Wy�wietlenie menu pozwalaj�cego na wyb�r trybu pracy Kalkulatora
	 */
	private void printMenu() {
		System.out.println();
		System.out.println("Menu programu KALKULATOR: ");
		System.out.println("Wybierz tryb dzia�ania kalkulatora: ");
		System.out.println("1. W konsoli");
		System.out.println("2. Z pliku");
		System.out.println("Wyb�r: ");
	}
}
