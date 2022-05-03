package z_doit_java;

import java.util.Arrays;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class T06_14 {
	static void sort(Object[] arr, int fromIndex, int toIndex) {};
	
	public static void main(String[] args) {
		GregorianCalendar[] arr = {
				new GregorianCalendar(2017, NOVEMBER, 1),
				new GregorianCalendar(1963, OCTOBER, 18),
				new GregorianCalendar(1985, APRIL, 5),
		};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%04d³â %02d¿ù %02dÀÏ\n", arr[i].get(YEAR), arr[i].get(MONTH)+1, arr[i].get(DATE));
		}
	}
}
