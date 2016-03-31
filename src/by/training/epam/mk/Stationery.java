package by.training.epam.mk;

public abstract class Stationery {
	private int price;
	private String producer;

	public abstract int getPrice();
	public abstract void setPrice(int price);
	public abstract String getProducer();
	public abstract void setProducer(String producer);

	public void costStationery(Stationery... st) {
		double cost;
		for (Stationery stationery : st) {

		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
