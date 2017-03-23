/**
 * 
 */
package pl.uksw.java.lab.kalkulator;

import org.apache.commons.lang3.StringUtils;

/**
 * Klasa zawieraj¹ca linijkê podlegaj¹c¹ obliczeniom
 * @author Przemys³aw Gontarz 87850
 *
 */
public class LineCalculations {
	/**
	 * Linijka z obliczeniami zapisana jako String
	 */
	private String line;
	/**
	 * Wynik obliczeñ
	 */
	private int result;
	/**
	 * Pole s³u¿¹ce do chwilowej wartoœci liczby przy odczytywania znaku
	 */
	private int number;
	/**
	 * Konstruktor wprowadzaj¹cy linijkê, która bêdzie obliczona
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
