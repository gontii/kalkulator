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
	/**
	 * Oblicza wynik linijki
	 * TO DO: zmieni� na wczytanie pierwszej liczby nie ma porzeby wype�nia�, potem sprawdza� znak
	 * i nast�pnie odczytac liczb� i wykonac odpowiedni� operacj�
	 */
	public void calculate() {
		this.fillResultNeutralNumber();
		do {
			if (StringUtils.isNumeric(line.substring(0, 1))) 
			{
				number=number*10; 
				number=number+Integer.parseInt(line.substring(0, 1));
				line=line.substring(1); //obci�cie linijki o cyfr� wczytan�
				System.out.println(number);
			}
			else if (line.substring(0, 1).equals("+")) {
				result = result+number;
				number = 0; //wyczyszczenie, aby wczyta� kolejn� warto��
				line=line.substring(1);
			}
		} while (StringUtils.isNotEmpty(line));
		
		System.out.println(result);
	}
	/**
	 * Sprawdza pierwszy operator i wybiera element neutralny dzia�ania
	 */
	public void fillResultNeutralNumber() {
		int[] firstOperator = new int[4];
		firstOperator[0] = line.indexOf('+');
		firstOperator[1] = line.indexOf('-');
		firstOperator[2] = line.indexOf('*');
		firstOperator[3] = line.indexOf('/');
		int min = line.length(); //najwi�kszy mo�liwy indeks jest wyj�ciowy minimum
		int imin = 0; //operator, kt�ry b�dzie jako pierwszy
		for (int i=0;i<firstOperator.length;i++) {
			if (firstOperator[i]!=-1)
			{
				if (firstOperator[i] < min)
				{
					min = firstOperator[i];
					imin = i;
				}
			}
		}
		if (imin == 0 || imin == 1)
		{
			this.result = 0;
		}
		else
		{
			this.result = 1;
		}
		
	}
}