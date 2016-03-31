package by.training.epam.mk;
/**
 * 
 * @author mk
 * 
 * <p>public abstract class Stationery</p>
 *
 */
public abstract class Stationery {
	private double price;
	private String producer;

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
			cost =+ stationery.getPrice();
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
