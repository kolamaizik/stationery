package by.training.epam.mk;

public class Paper extends Stationery {
	private double price;
	private String producer;

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getProducer() {
		return producer;
	}

	@Override
	public void setProducer(String producer) {
		this.producer=producer;
	}
	
	@Override
	public String toString() {
		return String.format("%s, price = %s, producer - %s, type - %s", getName(), getPrice(), getProducer());
	}
}