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
	 * Pobiera warto�� pola line z wczytan� ostatni� linijk�
	 * @return Linijka z obliczeniami
	 */
	public String getLine() {
		return line;
	}
	/**
	 * Wynik oblicze�
	 */
	private int result;
	/**
	 * Konstruktor wprowadzaj�cy linijk�, kt�ra b�dzie obliczona
	 * @param line Linijka oblicze�
	 */
	public LineCalculations(String line) {
		this.line=line;
	}
	/**
	 * Zwraca liczb� ze stringa
	 */
	private int getNumberFromLine() {
		int number = 0;
		//sprawdzenie czy koniec znak�w w linijce && czy kolejna znak to cyfra
		while(StringUtils.isNotEmpty(line)&& StringUtils.isNumeric(line.substring(0, 1)))
			{
				number=number*10; 
				number=number+Integer.parseInt(line.substring(0, 1));
				line=line.substring(1); //obci�cie linijki o cyfr� wczytan�
				
			}
		return number;
	}
	/**
	 * Oblicza wynik linijki
	 */
	public void calculate() {
		result = this.getNumberFromLine(); // pobiera pierwsz� liczb�
		while (StringUtils.isNotEmpty(line)) {
			if (line.substring(0, 1).equals("+")) {
				line=line.substring(1); //wyci�cie z linii wczytanego operatora
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