package by.training.epam.mk;

public class Pen extends WriteTools {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%s, price = %s, producer - %s, type - %s", getClass().getSimpleName(), getPrice(), getProducer(), getType());
	}
}
