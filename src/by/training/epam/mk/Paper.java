package by.training.epam.mk;

public class Paper extends Stationery {
	private int price;
	private String producer;

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int cost) {
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
}