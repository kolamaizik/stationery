package by.training.epam.mk;

import java.util.Comparator;

/**
 * 
 * @author mk
 * 
 *         <p>
 *         public abstract class Stationery
 *         </p>
 *
 */
public abstract class Stationery implements Comparable<Stationery> /* , Comparator<Stationery>*/ {
	private String name;
	private double price;
	private String producer;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void costStationery(Stationery... st) {
		double cost;
		for (Stationery stationery : st) {
			cost = +stationery.getPrice();
		}
	}

/*
	@Override
	public int compareTo(Stationery obj) {
		Stationery st = (Stationery) obj;

		int result = name.compareTo(st.name);
		if (result != 0) {
			return result;
		}

		result = (int) price - (int) st.price;
		if (result != 0) {
			return (int) result / Math.abs(result);
		}

		return 0;
	}
*/

	@Override
	public int compareTo(Stationery obj) {
		Stationery st = (Stationery) obj;
		if (this.price < st.price) {
			return -1;
		} else if (this.price > st.price) {
			return 1;
		}
		return 0;
	}
/*
	public static Comparator<Stationery> stName = new Comparator<Stationery>() {

		public int compare(Stationery s1, Stationery s2) {
			String st1 = s1.getName().toUpperCase();
			String st2 = s2.getName().toUpperCase();

			// ascending order
			return st1.compareTo(st2);

			// descending order
			//return st2.compareTo(st1);
		}
	};
*/
}
