/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.util.Scanner;

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
	 * Bufor wej�ciowy klawiatury
	 */
	private Scanner scanner;
	/**
	 * Ustawia warto�ci domy�lne
	 */
	public Menu()
	{
		setUserOption(0);
	}
	/**
	 * Zwraca warto�� pola userOption
	 * @return Warto�� typu ca�kowitego, ostatni wyb�r u�ytkownika dotycz�cy trybu pracy kalkulatora
	 */
	public int getUserOption() {
		return userOption;
	}
	/**
	 * Ustawienie pola userOption zgodnie z ilo�ci� dost�pnych tryb�w pracy
	 * @param userOption Obecnie s� dwa tryby pracy. Je�li zostanie przekazana inna warto��, zostanie zast�pion� warto�ci� domy�lna (0)
	 */
	public void setUserOption(int userOption) {
		if (userOption ==1)
		{
			this.userOption = 1;
		}
		else if (userOption == 2)
		{
			this.userOption = 2;
		}
		else
		{
			this.userOption = 0;
		}
	}
	private void runOption() {
		if (this.userOption == 1)
		{
			ConsoleInput ci = new ConsoleInput();
			ci.read();
		}
	}
	/**
	 * Metoda odczytuj�ca wyb�r u�ytkownika
	 */
	private void readOption() {
		scanner = new Scanner(System.in);
		setUserOption(scanner.nextInt());	
	}
	/**
	 * Metoda organizuj�ca sterowanie programem. Zawiera wywo�anie poszczeg�lnych funkcji programu oraz steruje jego dzia�aniem
	 */
	public void run()
	{
		printMenu();
		readOption();
		runOption();
		System.out.println();
		System.out.println("Koniec programu.");
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
		System.out.print("Wyb�r: ");
	}
}
