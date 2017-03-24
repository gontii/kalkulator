/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import java.io.FileNotFoundException;
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
	 * Ostatnia wczytana linijka do oblicze�
	 */
	private LineCalculations lineCalculations;
	/**
	 * Ustawia warto�ci domy�lne
	 */
	public Menu()
	{
		setUserOption(0);
		this.lineCalculations = null;
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
	/**
	 * Zarz�dza przep�ywem poszczeg�lnych tryb�w odczytu
	 * @throws FileNotFoundException Nie znaleziono pliku do odczytu
	 */
	private void runOption() throws FileNotFoundException {
		if (this.userOption == 1)
		{
			do {
				ConsoleInput consoleInput = new ConsoleInput();
				lineCalculations = consoleInput.read();
				if (lineCalculations.getLine().equals("koniec")== true)
				{
					return;
				}
				System.out.print("=");
				lineCalculations.calculate();
			} while (lineCalculations.getLine().equals("koniec")== false); //odczyt dop�ki zostanie napotkany koniec
		}
		else if (this.userOption == 2) {
			FileInput fileinput = new FileInput();
			lineCalculations = fileinput.read();
			while (lineCalculations != null)
			{
				System.out.println(lineCalculations.getLine());
				System.out.print("=");
				lineCalculations.calculate();
				lineCalculations = fileinput.read(); //wczytanie kolejnej linijki
			}
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
	 * @throws FileNotFoundException Nie zosta� otwarty plik do odczytu
	 */
	public void run() throws FileNotFoundException
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
