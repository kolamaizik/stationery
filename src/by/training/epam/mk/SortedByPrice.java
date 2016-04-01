package by.training.epam.mk;

import java.util.Comparator;

public class SortedByPrice implements Comparator<OfficeObjects> {

	public int compare(OfficeObjects obj1, OfficeObjects obj2) {

		double price1 = obj1.getPrice();
		double price2 = obj2.getPrice();

		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}
}
