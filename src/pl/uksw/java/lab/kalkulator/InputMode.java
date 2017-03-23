/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

/**
 * Interfejs dla ró¿nych trybów wprowadzania danych
 * @author Przemys³aw Gontarz 87850
 *
 */
public interface InputMode {
	/**
	 * Metoda wprowadzaj¹ca odczytuj¹ca dane wejœciowe
	 * @return Ostatnio wczytana linijka obliczeñ
	 */
	public LineCalculations read();
}
