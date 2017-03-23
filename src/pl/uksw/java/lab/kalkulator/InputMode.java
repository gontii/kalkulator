/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

/**
 * Interfejs dla r�nych tryb�w wprowadzania danych
 * @author Przemys�aw Gontarz 87850
 *
 */
public interface InputMode {
	/**
	 * Metoda wprowadzaj�ca odczytuj�ca dane wej�ciowe
	 * @return Ostatnio wczytana linijka oblicze�
	 */
	public LineCalculations read();
}
