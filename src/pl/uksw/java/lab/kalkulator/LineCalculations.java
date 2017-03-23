/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import org.apache.commons.lang3.StringUtils;

/**
 * Klasa zawieraj�ca linijk� podlegaj�c� obliczeniom
 * @author Przemys�aw Gontarz 87850
 *
 */
public class LineCalculations {
	/**
	 * Linijka z obliczeniami zapisana jako String
	 */
	private String line;
	/**
	 * Wynik oblicze�
	 */
	private int result;
	/**
	 * Pole s�u��ce do chwilowej warto�ci liczby przy odczytywania znaku
	 */
	private int number;
	/**
	 * Konstruktor wprowadzaj�cy linijk�, kt�ra b�dzie obliczona
	 * @param line
	 */
	public LineCalculations(String line) {
		this.line=line;
	}
	
	public void calculate() {
		do {
			if (StringUtils.isNumeric(line.substring(0, 1))) 
			{
				number=number*10;
				number=number+Integer.parseInt(line.substring(0, 1));
				line=line.substring(1);
			}
		} while (StringUtils.isNotEmpty(line));
	}
}
