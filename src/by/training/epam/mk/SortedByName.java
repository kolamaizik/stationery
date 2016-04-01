package by.training.epam.mk;

import java.util.Comparator;

public class SortedByName implements Comparator<OfficeObjects> {

	public int compare(OfficeObjects obj1, OfficeObjects obj2) {

		String str1 = obj1.getName();
		String str2 = obj2.getName();

		return str1.compareTo(str2);
	}
}