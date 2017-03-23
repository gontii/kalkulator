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
	/**
	 * Oblicza wynik linijki
	 * TO DO: zmieniæ na wczytanie pierwszej liczby nie ma porzeby wype³niaæ, potem sprawdzaæ znak
	 * i nastêpnie odczytac liczbê i wykonac odpowiedni¹ operacjê
	 */
	public void calculate() {
		this.fillResultNeutralNumber();
		do {
			if (StringUtils.isNumeric(line.substring(0, 1))) 
			{
				number=number*10; 
				number=number+Integer.parseInt(line.substring(0, 1));
				line=line.substring(1); //obciêcie linijki o cyfrê wczytan¹
				System.out.println(number);
			}
			else if (line.substring(0, 1).equals("+")) {
				result = result+number;
				number = 0; //wyczyszczenie, aby wczytaæ kolejn¹ wartoœæ
				line=line.substring(1);
			}
		} while (StringUtils.isNotEmpty(line));
		
		System.out.println(result);
	}
	/**
	 * Sprawdza pierwszy operator i wybiera element neutralny dzia³ania
	 */
	public void fillResultNeutralNumber() {
		int[] firstOperator = new int[4];
		firstOperator[0] = line.indexOf('+');
		firstOperator[1] = line.indexOf('-');
		firstOperator[2] = line.indexOf('*');
		firstOperator[3] = line.indexOf('/');
		int min = line.length(); //najwiêkszy mo¿liwy indeks jest wyjœciowy minimum
		int imin = 0; //operator, który bêdzie jako pierwszy
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