/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.util.Scanner;

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
	 * Bufor wejœciowy klawiatury
	 */
	private Scanner scanner;
	/**
	 * Ustawia wartoœci domyœlne
	 */
	public Menu()
	{
		setUserOption(0);
	}
	/**
	 * Zwraca wartoœæ pola userOption
	 * @return Wartoœæ typu ca³kowitego, ostatni wybór u¿ytkownika dotycz¹cy trybu pracy kalkulatora
	 */
	public int getUserOption() {
		return userOption;
	}
	/**
	 * Ustawienie pola userOption zgodnie z iloœci¹ dostêpnych trybów pracy
	 * @param userOption Obecnie s¹ dwa tryby pracy. Jeœli zostanie przekazana inna wartoœæ, zostanie zast¹pion¹ wartoœci¹ domyœlna (0)
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
	 * Metoda odczytuj¹ca wybór u¿ytkownika
	 */
	private void readOption() {
		scanner = new Scanner(System.in);
		setUserOption(scanner.nextInt());	
	}
	/**
	 * Metoda organizuj¹ca sterowanie programem. Zawiera wywo³anie poszczególnych funkcji programu oraz steruje jego dzia³aniem
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
	 * Wyœwietlenie menu pozwalaj¹cego na wybór trybu pracy Kalkulatora
	 */
	private void printMenu() {
		System.out.println();
		System.out.println("Menu programu KALKULATOR: ");
		System.out.println("Wybierz tryb dzia³ania kalkulatora: ");
		System.out.println("1. W konsoli");
		System.out.println("2. Z pliku");
		System.out.print("Wybór: ");
	}
}
