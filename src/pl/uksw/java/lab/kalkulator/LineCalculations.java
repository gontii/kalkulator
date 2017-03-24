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
	 * Pobiera wartoœæ pola line z wczytan¹ ostatni¹ linijk¹
	 * @return Linijka z obliczeniami
	 */
	public String getLine() {
		return line;
	}
	/**
	 * Wynik obliczeñ
	 */
	private int result;
	/**
	 * Konstruktor wprowadzaj¹cy linijkê, która bêdzie obliczona
	 * @param line Linijka obliczeñ
	 */
	public LineCalculations(String line) {
		this.line=line;
	}
	/**
	 * Zwraca liczbê ze stringa
	 */
	private int getNumberFromLine() {
		int number = 0;
		//sprawdzenie czy koniec znaków w linijce && czy kolejna znak to cyfra
		while(StringUtils.isNotEmpty(line)&& StringUtils.isNumeric(line.substring(0, 1)))
			{
				number=number*10; 
				number=number+Integer.parseInt(line.substring(0, 1));
				line=line.substring(1); //obciêcie linijki o cyfrê wczytan¹
				
			}
		return number;
	}
	/**
	 * Oblicza wynik linijki
	 */
	public void calculate() {
		result = this.getNumberFromLine(); // pobiera pierwsz¹ liczbê
		while (StringUtils.isNotEmpty(line)) {
			if (line.substring(0, 1).equals("+")) {
				line=line.substring(1); //wyciêcie z linii wczytanego operatora
				result = result+this.getNumberFromLine();
			}
			else if (line.substring(0, 1).equals("-")) {
				line=line.substring(1);
				result = result-this.getNumberFromLine();
			}
			else if (line.substring(0, 1).equals("*")) {
				line=line.substring(1);
				result = result*this.getNumberFromLine();
			}
			else if (line.substring(0, 1).equals("/")) {
				line=line.substring(1);
				result = result/this.getNumberFromLine();
			}
		}
		System.out.println(result);
	}

	
}