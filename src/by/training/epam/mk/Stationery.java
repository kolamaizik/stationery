package by.training.epam.mk;

/**
 * 
 * @author mk
 * 
 *         <p>
 *         public abstract class Stationery
 *         </p>
 *
 */
public abstract class Stationery implements Comparable<Stationery> {
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
}
